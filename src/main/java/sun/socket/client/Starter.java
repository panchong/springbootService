package sun.socket.client;

import com.google.common.collect.Maps;
import io.socket.client.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * socketioclient 启动后，会自动触发此事件
 */
public class Starter {
    public static void start(Socket socket) throws Exception{
        setStateTest(socket);
    }

    /**
     * 測試setState的小例子
     * @param socket
     * @throws IOException
     */
    public static void setStateTest(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        Map map = Maps.newHashMap();
        String[] data = null;
        while((line = reader.readLine()) != null){
            data = line.split("=");
            map.clear();
            if(data.length == 2){
                map.put(data[0], data[1]);
            }else if(data.length == 3){
                Map inner = Maps.newHashMap();
                inner.put(data[1], data[2]);
                map.put(data[0], inner);
            }else{
                continue;
            }
            socket.emit("set state", map);
        }

    }
}
