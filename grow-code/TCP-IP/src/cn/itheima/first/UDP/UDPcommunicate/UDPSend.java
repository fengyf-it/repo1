package cn.itheima.first.UDP.UDPcommunicate;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
    发送端
 */

public class UDPSend {
    public static void main(String[] args) throws IOException {
        //创建要发送的数据,字节类型
        byte[] bytes = "一切都会好的!".getBytes();
        //创建接收端的IP,这里是自己发送给自己,IP地址就是自己
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        //创建数据包对象,封装要发送的数据,接收端IP,端口(端口号自定义,最好不要1024之前的)
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,inet,9000);
        //创建DatagramSocket对象,数据包的发送和接收对象
        DatagramSocket ds = new DatagramSocket();
        //调用ds的send()方法
        ds.send(dp);
        //关闭资源,比喻:pocket是快递件,socket是码头,将打包好的快递存在码头然后发出去,所以在关闭资源的时候,关闭码头就可以了
        ds.close();
    }
}
