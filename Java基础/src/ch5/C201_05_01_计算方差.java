package ch5;

import java.util.Scanner;

public class C201_05_01_计算方差 {
    public static void main(String[] args) {
        int n = 5;
        Scanner scanner = null;

            scanner = new Scanner(System.in);
            int []s = new int[5];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("请输入一个数");
                s[i] = scanner.nextInt();
                sum += s[i];

        }

        double ave = sum*1.0/n;

        sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += Math.pow(s[i]-ave,2);
//        }
        for (int x:s){
            sum += Math.pow(x-ave,2);
        }
        System.out.println(Math.sqrt(sum));
    }
}
