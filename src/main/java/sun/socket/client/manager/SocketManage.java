package sun.socket.client.manager;

import io.socket.client.Socket;

public class SocketManage {

    private final Socket socket;

    public SocketManage(Socket socket){
        this.socket = socket;
    }

    public void start(){
        socket.connect();
    }

    public void destroy(){
        socket.close();
    }
}
