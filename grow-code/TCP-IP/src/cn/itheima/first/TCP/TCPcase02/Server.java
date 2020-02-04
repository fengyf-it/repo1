package cn.itheima.first.TCP.TCPcase02;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务器开启");
        ServerSocket server = new ServerSocket(8888);
        Scanner scanner = new Scanner(System.in);
        while(true){
            Socket socket = server.accept();
            InputStream in = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            System.out.println(new String(bytes, 0, len));
            /*int len =0;
            while((len = in.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }*/
            System.out.println("请输入给客户端的回复:");
            String response = scanner.nextLine();
            OutputStream out = socket.getOutputStream();
            out.write(response.getBytes());
            /*String filePathName = "C:\\Users\\38404\\Desktop\\accept\\"+System.currentTimeMillis()+".avi";
            FileOutputStream fos = new FileOutputStream(filePathName);
            byte[] bytes = new byte[1024];
            int len =0;
            while((len=in.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }*/
        }

    }
}
