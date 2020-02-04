package cn.itheima.first.TCP.review;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器端,确定端口号
        ServerSocket serverSocket = new ServerSocket(8888);
        //使用serverSocket当中的accept()方法获取socket套接字对象
        Socket socket = serverSocket.accept();
//        System.out.println(socket);
        //通过套接字socket获取读取流,用来读取客户端发来的数据
        InputStream inputStream = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = 0;
        while ((len=inputStream.read(data))!=-1){
            System.out.println(new String(data,0,len));
        }

//        socket.close();
//        serverSocket.close();
    }
}
