package src.ch1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C203_01_03_Data {
    public static void main(String[] args) {
        Date d1 = new Date(100000);
        System.out.println(d1);
        Date d2 = new Date();
        System.out.println(d2);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf.format(d2));
    }
}
