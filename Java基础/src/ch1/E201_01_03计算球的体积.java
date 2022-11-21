package ch1;

import java.util.Scanner;

public class E201_01_03计算球的体积 {
    public static void main(String[] args) {
            /*
    (1)输入
    (2)接收输入
    (3)表达式计算结果 v = π*r*r*r*4/3
    (4)输出结果
     */

        //输入
        System.out.println("请输入球的半径");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        //计算球的体积
        double v = 4.0*Math.PI*r*r*r/3;

        //输出
        System.out.printf("半径为%f的球的体积为:%f",r,v);
    }
}
