package broadcast_app;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Datagram_Dome0 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        DatagramSocket socket=new DatagramSocket();

        while(true) {
            String address = sc.nextLine();
            if("eixt".equals(address)) {
                System.out.println("ιεΊζε");
                break;
            }
            byte[] bytes =address.getBytes();
            DatagramPacket packet=new DatagramPacket(bytes, bytes.length, InetAddress.getByName("255.255.255.255"),9999);
            socket.send(packet);
        }
        socket.close();
    }
}
