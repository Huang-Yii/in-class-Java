package ch4;

import java.util.Scanner;

public class E201_04_05验证角谷定理 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个自然数：");
        int num1 = scan.nextInt();

        //如果num1值为1
        if(num1 == 1){
            num1 = num1*3+1;
            System.out.println(num1+"\n"+2+"\n"+1);
            num1 = 1;
        }

        if(num1 == 0){
            System.out.println(0);
        }
        //判断奇偶数并作出相应判断
        while (num1 != 1 && num1 != 0) {
            if(num1%2 == 0) {
                num1 = num1 / 2;
                System.out.println(num1);
            }
            else{
                num1 = num1*3+1;
                System.out.println(num1);
            }
        }
    }
}
