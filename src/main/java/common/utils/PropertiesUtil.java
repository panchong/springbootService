package common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by panchong on 2021/2/18.
 */
@Slf4j
public class PropertiesUtil {

    private static Properties props;

    static {
        String fileName = "redis.properties";
        String paycoreName = "paycore.properties";
        props = new Properties();
        try {
            props.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName),
                    "UTF-8"));
            props.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(paycoreName),
                    "UTF-8"));
        } catch (IOException e) {
            log.error("配置文件读取异常", e);
        }
    }

    public static String getProperty(String key) {
        String value = props.getProperty(key.trim());
        if (StringUtils.isBlank(value)) {
            return null;
        }
        return value.trim();
    }

    public static String getProperty(String key, String defaultValue) {

        String value = props.getProperty(key.trim());
        if (StringUtils.isBlank(value)) {
            value = defaultValue;
        }
        return value.trim();
    }

    public static void main(String[] arg) {
        System.out.println(PropertiesUtil.getProperty("rocketmq.send.consumerGroup"));
    }
}
