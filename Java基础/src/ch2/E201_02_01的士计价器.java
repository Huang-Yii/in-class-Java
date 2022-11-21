package ch2;

import java.util.Scanner;

public class E201_02_01的士计价器 {
    public static void main(String[] args) {
        System.out.println("请输入出行的行程：");
        Scanner scanner = new Scanner(System.in);
        float price;
        float distance = scanner.nextFloat();
        if(distance>0&&distance<=2){
            price= 7f;}
        else if(distance>2) {
            price = 7F + (distance - 2) * 3;
        }
        else{
            price = 0;
        }
        System.out.println("你的费用为" +price);
    }
}
