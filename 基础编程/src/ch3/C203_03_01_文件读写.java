package src.ch3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C203_03_01_文件读写 {
    public static void main(String[] args) {
        try {
            /*FileOutputStream fos = new FileInputStream("d:/test.dat");
            try {
                fos.write(11);
                fos.write(22);
                byte []buff = {33,44,55};
                fos.write(buff);
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();*/
            try {
                FileInputStream fis = new FileInputStream("d:/test.dat");
                byte []buff = new byte[10];
                fis.skip(1);
                fis.read(buff,0,4);
                fis.close();

                for (byte b:buff);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
