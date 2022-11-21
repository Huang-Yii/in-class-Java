package src.ch3;

import java.awt.*;
import java.io.*;

public class C203_03_02_文件读写2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("d:/test2");
            try {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeInt(1000);
                oos.writeDouble(99.888);

                Point p1 = new Point(4,6);
                oos.writeObject(p1);

                oos.close();
                fos.close();

                FileInputStream fis = new FileInputStream("d:/test2");
                ObjectInputStream ois = new ObjectInputStream(fis);
                int x = ois.readInt();
                double y = ois.readDouble();
                try {
                    Point p2 = (Point) ois.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                ois.close();
                fis.close();
                System.out.println(x);
                System.out.println(y);

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
