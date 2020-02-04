package cn.itheima.first.UDP.UDPcommunicate;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/*
    接收端
 */

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        //创建数据包传输对象DatagramSocket,绑定端口号
        DatagramSocket ds = new DatagramSocket(9000);
        //创建字节数组,用来接收数据
        byte[] data = new byte[1024];
        //创建数据包对象,传递字节数组
        DatagramPacket dp = new DatagramPacket(data,data.length);
        //调用ds对象的receive()方法传递数据包
        ds.receive(dp);
        //获取接收到的字节个数
        int length = dp.getLength();
        String hostAddress = dp.getAddress().getHostAddress();
        int port = dp.getPort();
        System.out.println(new String(data,0,length) +"...来自于..."+hostAddress+":"+port);
        ds.close();
    }
}
