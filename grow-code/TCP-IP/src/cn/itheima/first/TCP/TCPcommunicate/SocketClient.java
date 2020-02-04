package cn.itheima.first.TCP.TCPcommunicate;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    创建客户端
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象连接服务器
        Socket socket = new Socket("127.0.0.1",8888);
        //通过客户端的套接字对象Socket方法,获取字节输出流,将数据写向服务器
        OutputStream out = socket.getOutputStream();
        out.write("HelloWorld".getBytes());

        /*
            读取服务器回传过来的数据,要使用socket套接字对象中的字节输入流
         */
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = 0;
        while((len = in.read(data))!=-1){
            System.out.println(new String(data,0,len));
        }
        /*int len = in.read(data);
        System.out.println(new String(data,0,len ));*/

        //释放资源
        socket.close();
    }
}
