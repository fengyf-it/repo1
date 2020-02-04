package cn.itheima.first.TCPReview;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8889);

        Socket socket = server.accept();
        InputStream in = socket.getInputStream();

        int len;
        byte[] bytes = new byte[1024];
        /*int len = in.read(bytes);
        System.out.println(new String(bytes,0,len));*/
        while ((len = in.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }


        OutputStream out = socket.getOutputStream();
        out.write("收到".getBytes());

        socket.close();
        server.close();
    }
}
