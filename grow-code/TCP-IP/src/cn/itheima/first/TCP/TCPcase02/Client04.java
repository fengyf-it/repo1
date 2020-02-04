package cn.itheima.first.TCP.TCPcase02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client04 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        while (true){
            Socket socket = new Socket("127.0.0.1",8888);
            System.out.println("请输入传给客户端的信息:");
            String message = scanner.nextLine();
            OutputStream out = socket.getOutputStream();
            out.write(message.getBytes());
            InputStream in = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len=in.read(bytes);
            System.out.println(new String(bytes,0,len));
            /*int len =0;
            while((len = in.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }*/
        }
    }
}
