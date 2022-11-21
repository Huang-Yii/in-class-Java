package ch4;

import java.util.Scanner;

public class C201_04_01_计算平均分 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入个数");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++){
            System.out.println("请输入一个数");
            int a = scanner.nextInt();
            sum += a;
        }

        double ave = sum/3.0;
        System.out.println(ave);
    }
}
