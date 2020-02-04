package cn.itheima.first.TCP.TCPcase01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    文件上传案例
        从客户端将一张图片上传到服务器
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);

        //获取输出字节流对象
        OutputStream outputStream = socket.getOutputStream();
        //创建读取对象,需要对上传的图片进行读取
        FileInputStream fis = new FileInputStream("d:\\test\\a.png");
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        //给服务器写终止序列
        socket.shutdownOutput();
        //读取服务器传回来的上传成功信息
        InputStream inputStream = socket.getInputStream();
        len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));

        fis.close();
        socket.close();
    }
}
