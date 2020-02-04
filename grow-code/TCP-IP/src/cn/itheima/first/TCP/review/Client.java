package cn.itheima.first.TCP.review;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端,连接服务器端,服务器端的IP地址就写本机
        Socket socket = new Socket("127.0.0.1",8888);
        //创建io流,发送数据,所以输出流,不能自己new,要通过socket当中的方法获取
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("你好,尊敬的地球文明".getBytes());
//        System.out.println(socket);
        socket.close();
    }
}
