package src.ch3;

import java.io.File;

public class C203_03_05_File {
    public static void main(String[] args) {
//        File dir = new ("d:/");
//        System.out.println(dir.isDirectory());
//        String []Files = dir.list();
//        for (String f:files){
//            System.out.println(f);
//        }
        File file = new File("d:/test3");
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.length());
        file.delete();
    }
}
