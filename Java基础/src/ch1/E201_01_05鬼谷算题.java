package ch1;

import java.util.Scanner;

public class E201_01_05鬼谷算题 {
    public static void main(String[] args) {
        /*
        (1)提示输入三个数
        (2)接收输入
        (3)表达式计算结果
        (4)输出结果
         */

        //输入
        System.out.println("请输入三个数");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        //计算鬼谷数
        int n = ((a*70)+(b*21)+(c*15))%105;

        //输出
        System.out.printf("得到的鬼谷数为:%d",n);

    }
}
