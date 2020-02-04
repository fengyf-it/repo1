package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiveReview01 {
    public static void main(String[] args) throws IOException {
        //创建数据包传输对象,绑定端口号
        DatagramSocket ds = new DatagramSocket(8888);
        //创建字节数组用来接收数据包
        byte[] bytes = new byte[1024];
        //创建数据包对象,用来传递字节数组
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //数据包传输对象的receive方法,传递数据包
        ds.receive(dp);
        //获取接收到的字节个数
        int len = dp.getLength();
        System.out.println(new String(bytes,0,len));
        ds.close();
    }
}
