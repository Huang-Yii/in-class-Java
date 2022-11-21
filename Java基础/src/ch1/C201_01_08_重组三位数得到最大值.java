package ch1;

import java.util.Scanner;

public class C201_01_08_重组三位数得到最大值 {
    public static void main(String[] args) {
        /*
        思路：
（1）提示输入
（2）接收输入
（3）分别计算百位、十位和个位
（3.1）除以100得到商为百位
（3.2）对100求余，然后再除以10得到商为十位
（3.3）对10求余得到个位
（4）计算最大值、最小值和中间值
（5）最大的数作为百位、中间值作为十位，最小值作为个位
（6）输出结果
         */
        //输入
        System.out.println("请输入一个三位数");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //分解
        int b100 = num/100;
        int b10 = (num%100)/10;
        int b1 = num%10;

        //重组
        int max = Math.max(Math.max(b100,b10),b1);
        int min = Math.min(Math.min(b100,b10),b1);
        int mid = b100+b10+b1-max-min;
        int val = max*100+mid*10+min;

        //输出
        System.out.printf("%d重组出最大的数是%d\n",num,val);
    }
}
