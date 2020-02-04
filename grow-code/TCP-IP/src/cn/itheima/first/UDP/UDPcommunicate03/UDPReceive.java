package cn.itheima.first.UDP.UDPcommunicate03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(7777);

        byte[] bytes = new byte[1024];

        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(datagramPacket);

        int len = datagramPacket.getLength();
        System.out.println(new String(bytes,0,len));
        datagramSocket.close();
    }
}
