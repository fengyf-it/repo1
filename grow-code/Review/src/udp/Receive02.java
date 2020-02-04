package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive02 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8888);
        byte[] bytes = new byte[1024];
        while(true){
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            ds.receive(dp);
            int len = dp.getLength();
            System.out.println(new String(bytes,0,len));
        }

    }
}
