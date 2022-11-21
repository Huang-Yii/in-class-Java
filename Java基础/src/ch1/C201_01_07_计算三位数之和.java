package ch1;

import java.util.Scanner;

public class C201_01_07_计算三位数之和 {
    public static void main(String[] args) {
        /*
        思路：
（1）提示输入
（2）接收输入
（3）分别计算百位、十位和个位(此时可以不用去考虑如何计算等细节问题)
（3.1）除以100得到商为百位
（3.2）对100求余，然后再除以10得到商为十位
（3.3）对10求余得到个位
（4）求和
（5）输出结果
         */
        System.out.println("请输入三位数");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int b100 = num/100;
        int b10 = (num%100)/10;
        int b1 = num%10;
        int sum = b100+b10+b1;

        System.out.printf("%d的三位数之和=%d",num,sum);
    }
}
