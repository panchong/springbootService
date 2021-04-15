package sun.socket.client.param;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = Param.PREFIX)
public class Param {
    public static final String PREFIX = "param";
    String lessonUID;
    String mobile;
    String name;
    String role;
    String clientVersion;
    String duration;
    String roleName;
    String channel;
    String lessonType;
    String firstChannel;
    String token;
    String recordID;


    @Override
    public String toString() {
        return "lessonUID=" + lessonUID + "&" +
                "userId=" + mobile + "&" +
                "name=" + name + "&" +
                "role=" + role + "&" +
                "clientVersion=" + clientVersion + "&" +
                "duration=" + duration + "&" +
                "roleName=" + roleName + "&" +
                "channel=" + channel + "&" +
                "lessonType=" + lessonType + "&" +
                "firstChannel=" + firstChannel + "&" +
                "token=" + token + "&" +
                "recordID=" + recordID;
    }
}
