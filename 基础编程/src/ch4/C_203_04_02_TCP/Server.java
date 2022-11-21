package src.ch4.C_203_04_02_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSocket server;

    {
        try {
            server = new ServerSocket(8000);
            Socket client = server.accept();
            System.out.println(client.getInetAddress().getHostAddress()+"连上了");
            InputStream is = client.getInputStream();
            byte []buff = new byte[100];
            while (true){
                int len = is.read(buff);
                String str = new String(buff,0,len);
                System.out.println(str);
                if (str.equals("exit")){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
