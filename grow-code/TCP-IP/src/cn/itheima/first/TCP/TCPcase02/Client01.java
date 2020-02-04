package cn.itheima.first.TCP.TCPcase02;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",8888);

        OutputStream out = socket.getOutputStream();
        FileInputStream fis = new FileInputStream("C:\\Users\\38404\\Desktop\\share\\video.avi");
        byte[] bytes = new byte[1024];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            out.write(bytes,0,len);
        }

        fis.close();
        socket.close();

    }
}
