package tcp.demo01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        //创建套接字,连接服务期端的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //创建IO流对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            String cont = scanner.nextLine();
            out.write(cont.getBytes());
//            int len = in.read()
            byte[] bytes = new byte[1024];
            int len=0;
            while((len=in.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }
        }

    }
}
