package sun.socket.client.config;

import io.socket.client.IO;
import io.socket.client.Socket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.socket.client.manager.SocketManage;
import sun.socket.client.param.Param;

import java.net.URISyntaxException;

/**
 * 基本配置，只需要編寫回調事件和修改配置文件即可
 */
@Configuration
public class Config {
    /**
     * 地址
     */
    @Value("${socket-url}")
    private String socket_url;

    /**
     * 參數
     */
    @Autowired
    private Param param;

    /**
     * 選項注入
     * @return
     */
    @Bean
    public IO.Options options(){
        IO.Options options = new IO.Options();
        options.query = param.toString();
        return options;
    }

    /**
     * 創建Socket
     * @param options
     * @return
     * @throws URISyntaxException
     */
    @Bean
    public Socket socket(IO.Options options) throws URISyntaxException {
        Socket socket = IO.socket(socket_url, options);
        return socket;
    }


    /**
     * 注冊管理器，開啓服務
     * @param socket
     * @return
     */
    @Bean(destroyMethod = "destroy")
    public SocketManage socketManage(Socket socket){
        SocketManage manager = new SocketManage(socket);
        manager.start();
        return manager;
    }
}
