package src.ch3;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class C203_03_04_缓冲机制 {
    public static void main(String[] args) {
        //不带缓冲机制
        System.out.println(11);
        System.out.println(22);
        System.out.println(33);

        BufferedOutputStream bos = new BufferedOutputStream(System.out,3);
        try {
            bos.write(97);
            bos.write(98);
            bos.write(99);
            bos.write(100);
            bos.write(101);
            bos.flush();
            bos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
