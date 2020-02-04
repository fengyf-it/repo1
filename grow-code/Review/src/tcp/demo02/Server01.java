package tcp.demo02;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=in.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        socket.close();
        server.close();
    }
}
