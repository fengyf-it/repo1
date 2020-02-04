package tcp.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\38404\\Desktop\\accept\\a.avi");
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=in.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        server.close();

    }
}
