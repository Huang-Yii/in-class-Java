package src.ch4.C_203_04_01_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    DatagramSocket socket;

    {
        try {
            socket = new DatagramSocket(8000);//监听8000窗口
            byte []buff = new byte[100];
            DatagramPacket packet = new DatagramPacket(buff,100);//创建包用于接收数据
            while (true){
                try {
                    socket.receive(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String str = new String(buff,0,packet.getLength());
                if (str.equals("exit")){
                    break;
                }
                System.out.printf("%s:%s\n",packet.getAddress().getHostAddress());
            }
            try {
                socket.receive(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(new String(buff));
            socket.close();

        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
