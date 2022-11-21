package src.ch4.C_203_04_01_UDP;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        DatagramSocket socket;

        {
            try {
                socket = new DatagramSocket();
                InetAddress address = null;
                try {
                    address = InetAddress.getByName("127.0.0.1");
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                byte []buff = "hello".getBytes();
                DatagramPacket packet = new DatagramPacket(buff,buff.length,address,8000);
                try {
                    socket.send(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                socket.close();
            } catch (SocketException e) {
                e.printStackTrace();
            }
        }
    }

}
