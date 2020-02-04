package cn.itheima.first.UDP.UDPcommunicate02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            String message = scanner.nextLine();
            byte[] bytes = message.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,inet,9001);
            ds.send(dp);
        }
//        ds.close();
    }
}
