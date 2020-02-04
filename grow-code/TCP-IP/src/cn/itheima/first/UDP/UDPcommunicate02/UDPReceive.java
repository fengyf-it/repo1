package cn.itheima.first.UDP.UDPcommunicate02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(9001);
        byte[] bytes = new byte[1024];
        while (true) {
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);
            String hostAddress = dp.getAddress().getHostAddress();
            int port = dp.getPort();
            int length = dp.getLength();
            System.out.println(new String(bytes, 0, length) + "..." + hostAddress + ":" + port);
        }

    }
}
