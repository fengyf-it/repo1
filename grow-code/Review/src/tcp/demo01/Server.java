package tcp.demo01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
    使用TCP,进行客户端和服务器端聊天
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8888);

        Scanner scanner = new Scanner(System.in);
        while(true){
            Socket socket = server.accept();
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int len = 0 ;
            while((len=in.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }
            String cont = scanner.nextLine();
            out.write(cont.getBytes());
        }
    }
}
