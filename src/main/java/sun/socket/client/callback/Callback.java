package sun.socket.client.callback;

import com.google.common.collect.Maps;
import com.google.protobuf.ByteString;
import io.socket.client.Socket;
import org.springframework.stereotype.Component;
import sun.socket.EventConsts;
import sun.socket.client.event.anno.Event;
import sun.socket.pb.BaseMessagePB;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 回调事件注冊
 */
@Component
public class Callback {

    @Resource
    private Socket socket;

    final Map<String, Map<String, Boolean>>map = Maps.newHashMap();
    final Map<String, Boolean> inner = Maps.newHashMap();
    boolean flag = true;
    final BaseMessagePB.BaseMessage message;

    {
        message = BaseMessagePB.BaseMessage.newBuilder().setVerNo(1).setData(ByteString.copyFromUtf8("fuck")).setMsgId(123).build();
    }
    /**
     * 連接通知
     */
    @Event(event = Socket.EVENT_CONNECT)
    public void connect(){
        System.out.println("connect");
        socket.emit(EventConsts.BASEMESSAGE, (Object) message.toByteArray());

    }
    /**
     * 連接中
     */
    @Event(event = Socket.EVENT_CONNECTING)
    public void connecting(){
        System.out.println("connecting");
    }
    @Event( event = "responseHeaders")
    public void response(Object object){
        System.err.println(object.toString());
    }
}
