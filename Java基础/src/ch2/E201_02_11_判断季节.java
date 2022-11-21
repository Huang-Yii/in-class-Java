package ch2;

import java.util.Scanner;

public class E201_02_11_判断季节 {
    public static void main(String[] args) {
        //输入月份
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        //判断季节并输出
        if(month==12||month==1||month==2){
            System.out.println("冬季！");
        }
        if(month>2&&month<=5){
            System.out.println("春季！");
        }
        if(month>5&&month<=8){
            System.out.println("夏季！");
        }
        if(month>8&&month<=11){
            System.out.println("秋季！");
        }
    }
}
