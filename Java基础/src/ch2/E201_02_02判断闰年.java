package ch2;

import java.util.Scanner;

public class E201_02_02判断闰年 {
    public static void main(String[] args) {
        System.out.println("请输入年份: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int flag = 0;
        if (year % 4 == 0 && year % 100 != 0) {
            flag = 1;
        } else if (year % 400 == 0) {
            flag = 1;
        }
        if (flag == 1) {
            System.out.printf("%d是闰年！", year);
        } else {
            System.out.printf("%d不是闰年！", year);
        }
    }
}
