package broadcast_app;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Datagram_Dome1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9999);

        OutputStream fos = new FileOutputStream("src/dat.txt",true);

        byte[] bytes = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        socket.receive(packet);
        int len = packet.getLength();
        while (len > 0) {
            System.out.println(packet.getAddress()+"/"+packet.getPort()+"==>"+new String(bytes,0,packet.getLength()));
            fos.write(bytes,0,len);
            fos.write('\n');
            socket.receive(packet);
            len = packet.getLength();
        }
        System.out.println();
        socket.close();
        fos.close();
    }
}
