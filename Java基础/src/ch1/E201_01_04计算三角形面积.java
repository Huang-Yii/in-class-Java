package ch1;

import java.util.Scanner;

public class E201_01_04计算三角形面积 {
    public static void main(String[] args) {
        /*
        (1)输入
        (2)接收输入
        (3)计算n = (a+b+c)/2
        (4)代入海伦公式计算结果s
        (5)输出结果
         */

        //输入
        System.out.println("请输入三角形的三条边长:a b c");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //计算三角形的面积
        double n = (a+b+c)/2;
        double s = Math.sqrt(n*(n-a)*(n-b)*(n-c));

        //输出
        System.out.printf("边长为%d %d %d的三角形面积为:%f",a,b,c,s);
    }
}
