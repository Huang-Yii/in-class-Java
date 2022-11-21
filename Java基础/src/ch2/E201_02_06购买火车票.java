package ch2;

import java.util.Scanner;

public class E201_02_06购买火车票 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scan.nextInt();
        System.out.println("请输入票型：");
        String ticketType =scan.next();
        float price = 0;
        if(age>=18){
            if("硬座".equals(ticketType)){
                price=100;
            }
            if("硬卧".equals(ticketType)){
                price=190;
            }
        }
        else{
            System.out.println("请输入身高：");
            float height = scan.nextFloat();
            if("硬座".equals(ticketType)&&height<120){
                price=0;
            }
            if("硬座".equals(ticketType)&&height<150&&height>=120){
                price=100/2;
            }
            if("硬座".equals(ticketType)&&height>=150){
                price=100;
            }
            if("硬卧".equals(ticketType)){
                price=190-50;
            }
        }
        System.out.println("你需要支付的价格为："+price);
    }
}
