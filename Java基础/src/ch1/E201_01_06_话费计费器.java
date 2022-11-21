package ch1;

import java.util.Scanner;

public class E201_01_06_话费计费器 {
    public static final double price = 0.2;
    public static void main(String[] args) {
        /*
        (1)提示输入
        (2)接收输入
        (3)计算费用
        (3.1)通话时长对60取余得到sum
        (3.2)对s取整加上通话时长除以60的结果得到time
        (3.3)费用cost = price*t
        (4)输出结果
         */

        //输入
        System.out.println("请输入通话时长");
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();

        //计算费用
        int sum = (int)time/60;
        double cost = price*((time%60>0)?(++sum):(sum));

        //输出结果
        System.out.printf("通话时长为%.2f秒的费用为:%.2f",time,cost);
    }
}
