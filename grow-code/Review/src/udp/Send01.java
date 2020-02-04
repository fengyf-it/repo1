package udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Send01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            String cont = scanner.nextLine();
            byte[] bytes = cont.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, inet, 8888);
            ds.send(dp);
        }
//        ds.close();
    }
}
