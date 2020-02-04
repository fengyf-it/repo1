package udp;

import java.io.IOException;
import java.net.*;

public class UDPSendReview01 {
    public static void main(String[] args) throws IOException {
        //封装要传输的的数据
        byte[] bytes = "UDP发送数据端".getBytes();
        //创建接收端的IP
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        //创建数据包对象,参数需要:数据包,数据包长度,接收方的IP地址和端口号
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,inet,8888);
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //调用发送的方法
        ds.send(dp);
        //释放资源,只需要释放掉发送的资源就可以
        ds.close();
    }
}
