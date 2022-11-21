package ch1;

import java.util.Scanner;

public class E201_01_02计算圆形面积 {
    public static void main(String[] args) {
        /*
        (1)提示输入
        (2)接收输入
        (3)表达式计算结果 s = π*r*r
        (4)输出结果
         */

        //输入
        System.out.println("请输入圆的半径");
        Scanner scanner = new Scanner(System.in);

        //计算圆的面积
        int r = scanner.nextInt();
        float s = (float) Math.PI*r*r;

        //输出
        System.out.printf("半径为%d的圆的面积为%f",r,s);
    }
}
