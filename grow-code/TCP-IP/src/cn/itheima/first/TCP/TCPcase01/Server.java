package cn.itheima.first.TCP.TCPcase01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();

        InputStream in = socket.getInputStream();
        //将目的文件夹封装到File对象
        //防止文件同名被覆盖,重新定义从客户端接收到的文件名字
        //名字的规则由自己来定义
        String fileName = "itheima"+System.currentTimeMillis()+new Random().nextInt(9999)+".png";
        File upload = new File("d:\\test\\upload");
        if (!upload.exists()) {
            upload.mkdirs();
        }
        //创建字节输出流,将图片写入到目的文件夹中
        FileOutputStream fos = new FileOutputStream(upload + File.separator+fileName);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = in.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        socket.getOutputStream().write("上传成功".getBytes());

//        fos.close();
//        socket.close();
//        server.close();
    }
}
