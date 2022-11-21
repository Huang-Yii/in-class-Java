package ch3;

import java.util.Scanner;

public class E201_03_02判断水仙花数 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数：");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num<100 || num>999){ //将&&修改为||
            System.out.println(num+"不是一个三位数");
            return;
        }

        int b100 = num/100;
        int b10 = num%100/10;
        int b1 = num%10;

        boolean result = b100*b100*b100+b10*b10*b10+b1*b1*b1 == num;
        if(result == true){ //将赋值=改为关系运算==
            System.out.println(num+"是水仙花数");
        }else{
            System.out.println(num+"不是水仙花数");
        }
    }
}
