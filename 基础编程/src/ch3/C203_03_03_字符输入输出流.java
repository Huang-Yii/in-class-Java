package src.ch3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class C203_03_03_字符输入输出流 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("d:/test3");
            fw.write("hello");
            fw.close();

            FileReader fr = new FileReader("d:/data3");
            char []buff = new char[10];
            fr.read(buff);
            String str = new String(buff);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
