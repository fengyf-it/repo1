package cn.itheima.first.UDP.UDPcommunicate03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        //创建需要发送的字节数组
        byte[] bytes = "UDP传输".getBytes();
        //获取IP地址
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,inetAddress,7777);

        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.send(datagramPacket);

        datagramSocket.close();

    }
}
