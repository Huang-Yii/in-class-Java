package ch1;

import java.util.Scanner;

public class E201_01_01温度转换 {
    public static void main(String[] args) {
        /*
        (1)提示输入
        (2)接收输入
        (3)表达式转换数据(f-32)*5/9
        (4)输出结果
         */

        //输入
        System.out.println("请输入华氏温度值");
        Scanner scanner = new Scanner(System.in);
        double f = scanner.nextDouble();

        //计算摄氏温度
        double c = (f-32)*5/9;

        //输出
        System.out.printf("%.2f华氏温度为%.2f摄氏温度",f,c);

    }
}
