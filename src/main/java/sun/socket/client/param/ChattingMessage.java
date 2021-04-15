package sun.socket.client.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChattingMessage {

    private String nickname;
    private String mobile;
    private String roule;
    private String text;
    private long timestamp;

    private String roleName;
    private String toMobile;
    private String toRoleName;
    private int condition;

}
