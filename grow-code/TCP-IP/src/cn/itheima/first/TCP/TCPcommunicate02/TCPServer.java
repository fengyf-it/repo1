package cn.itheima.first.TCP.TCPcommunicate02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        /*
            接收由客户端传来的数据,输入
         */
        ServerSocket server = new ServerSocket(8866);
        Socket socket = server.accept();
        InputStream in =  socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        System.out.println(new String(data,0,len));

        /*
            向客户端发送数据,输出
         */
        OutputStream out = socket.getOutputStream();
        out.write("服务器向客户端传输数据".getBytes());

        socket.close();
        server.close();

    }
}
