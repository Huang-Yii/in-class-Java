package ch2;

import java.util.Scanner;

public class C201_02_02_计算三角形的面积 {
    public static void main(String[] args) {
        //输入三角形的三个边长
        System.out.println("请输入三个边长");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //判断能否组成三角形
        if (a+b>=c || a+b>=b || b+c>=a) {
            System.out.println("不能构成三角形");
            return;
        }
            //计算面积
            float s = (a+b+c)/2f;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

            //输出面积
            System.out.printf("三角形的面积为%.3f",area);

        /*if (a+b>c && a+b>b && b+c>a) {
         *   //计算面积
            float s = (a+b+c)/2f;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

            //输出面积
            System.out.printf("三角形的面积为%.3f",area);
        } else {
            System.out.println("不能构成三角形");
        }*/

    }
}
