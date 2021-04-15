package sun.socket.client.event.register;

import com.google.common.collect.Maps;
import io.socket.client.Socket;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import sun.socket.client.event.anno.Event;
import sun.socket.client.event.assist.HandlerEnhancer;
import sun.socket.client.event.handler.EventHandler;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;

/**
 * Spring注冊对象拦截
 */
@Component
public class RegiesterBeanProcessor implements BeanPostProcessor, Ordered, ApplicationRunner {

    @Resource
    private Socket socket;

    public static final Map map = Maps.newConcurrentMap();

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Arrays.asList(bean.getClass().getDeclaredMethods()).forEach(method->{
            if(method.isAnnotationPresent(Event.class)){
                String eventName = method.getAnnotation(Event.class).event();
                if(map.containsKey(eventName)){
                    System.out.println("handler must not bu duplicate, exist eventHandler : " + map.get(eventName));
                }else{
                    EventHandler handler = HandlerEnhancer.getHandler(eventName, bean, method);
                    // 增强成功
                    if(null != handler){
                        // 注冊回調
                        socket.on(eventName,handler);
                        // 記錄
                        map.put(eventName, handler);
                    }
                }
            }
        });
        return null;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        map.forEach((key, value)->
                System.out.println(String.format("regiestered : %s-%s", key, value.toString())));

    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return null;
    }
}
