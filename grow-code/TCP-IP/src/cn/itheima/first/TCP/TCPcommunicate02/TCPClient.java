package cn.itheima.first.TCP.TCPcommunicate02;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        /*
            向服务器端发送数据,输出
         */
        Socket socket = new Socket("127.0.0.1",8866);
        OutputStream out = socket.getOutputStream();
        out.write("地球人你好,我来自三体".getBytes());
        /*
            接收服务器端发来的数据,输入
         */
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
//        int len = in.read(data);
//        System.out.println(new String(data,0,len));
        int len =0;
        while((len = in.read(data))!=-1){
            System.out.println(new String(data,0,len));
        }

        socket.close();

    }
}
