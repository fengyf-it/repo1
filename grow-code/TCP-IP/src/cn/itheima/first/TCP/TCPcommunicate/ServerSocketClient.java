package cn.itheima.first.TCP.TCPcommunicate;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器端
 */
public class ServerSocketClient {
    public static void main(String[] args) throws IOException {
        //服务器的端口号
        ServerSocket serverSocket = new ServerSocket(8888);
        //调用服务器套接字对象中的accept()方法,获取客户端套接字对象
        Socket socket = serverSocket.accept();
        //通过客户端套接字对象,socket获取字节输入流
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];

//        int len = in.read(data);
//        System.out.println(new String(data,0,len));
        int len = 0;
        while ((len = in.read(data)) != -1) {
            System.out.println(new String(data, 0, len));
        }

        /*
            服务器向客户端回数据,字节输出流,通过客户端套接字对象获取字节输出流
         */
        OutputStream out = socket.getOutputStream();
        out.write("神奇海螺".getBytes());

        socket.close();
        serverSocket.close();

    }
}
