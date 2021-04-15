package sun.socket.client.event.assist;

import javassist.*;
import org.springframework.util.Assert;
import sun.socket.client.event.handler.EventHandler;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static com.godme.client.event.assist.CtClassAssistant.*;

public class HandlerEnhancer {
    /**
     * 自定義一個類
     * @param method
     * @return
     */
    public static CtClass create(Method method){
        return typeOf(nameOf(EventHandler.class) + "$" +method.getName());
    }


    /**
     * 實現接口
     * @param ctClass
     */
    public static void addSuperclass(CtClass ctClass){
        ctClass.addInterface(typeOf(EventHandler.class));
    }

    /**
     * 添加字段
     * 1. eventName
     * 2. bean 對象封裝，後續方法調用
     * @param ctClass
     * @param bean
     * @throws CannotCompileException
     */
    public static void addField(CtClass ctClass, Object bean) throws CannotCompileException {
        CtField eventNameField = new CtField(typeOf(String.class), "eventName", ctClass);
        CtField beanField = new CtField(typeOf(bean), "bean", ctClass);
        ctClass.addField(eventNameField);
        ctClass.addField(beanField);
    }

    /**
     * 添加構造參數，傳入eventName和Bean
     * @param ctClass
     * @param bean
     * @throws CannotCompileException
     */
    public static void setConstructor(CtClass ctClass, Object bean) throws CannotCompileException {
        CtConstructor constructor = new CtConstructor(typeOf(String.class, bean.getClass()), ctClass);
        constructor.setBody("{this.eventName = $1;this.bean = $2;}");

        ctClass.addConstructor(constructor);
    }

    /**
     * 1. eventName : 獲取事件名稱
     * 2. call : Emitter.Listen回調
     * @param ctClass
     * @param method
     * @throws CannotCompileException
     */
    public static void addMethod(CtClass ctClass, Method method) throws CannotCompileException {

        CtMethod eventNameMethod = new CtMethod(typeOf(String.class), "eventName", null, ctClass);
        eventNameMethod.setBody("{return this.eventName;}");


        CtMethod callMethod = new CtMethod(typeOf(void.class), "call", arrayTypeOf(Object[].class), ctClass);
        StringBuffer body = new StringBuffer("{");
        body.append("this.bean." + method.getName()+"(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        if(parameterTypes.length > 0){
            for(int index = 0; index < parameterTypes.length; index++){
                body.append(String.format("(%s)$1[%d],", parameterTypes[index].getCanonicalName(), index));
            }
            body.delete(body.length() -1, body.length());
        }
        body.append(");}");
        callMethod.setBody(body.toString());
        callMethod.insertBefore("System.out.println(\"*****************eventName : \" + this.eventName + \"************************\");");
        ctClass.addMethod(eventNameMethod);
        ctClass.addMethod(callMethod);
    }


    /**
     * 獲取構造函數並返回實例對象
     * @param ctClass
     * @param eventName
     * @param bean
     * @return
     * @throws Exception
     */
    public static EventHandler instance(CtClass ctClass,String eventName,Object bean) throws Exception{
//        ctClass.writeFile();
        Class<?> handlerClass = ctClass.toClass();
        Constructor constructor = handlerClass.getConstructor(new Class[]{String.class, bean.getClass()});
        Object handlerInstance = constructor.newInstance(eventName, bean.getClass().cast(bean));
        return (EventHandler)handlerInstance;
    }

    /**
     * 整套管理連接，傳入基本參數，直接返回新構造的EventHandler對象
     * @param eventName
     * @param bean
     * @param method
     * @return
     */
    public static EventHandler getHandler(String eventName, Object bean, Method method){
        try{
            CtClass ctClass = create(method);
            addSuperclass(ctClass);
            addField(ctClass,bean);
            setConstructor(ctClass, bean);
            addMethod(ctClass, method);
            return instance(ctClass, eventName, bean);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
