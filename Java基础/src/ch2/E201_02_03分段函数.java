package ch2;

import java.util.Scanner;

public class E201_02_03分段函数 {
    public static void main(String[] args) {
        System.out.println("请输入x:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println(n * n - 4 * n + 6);
        } else {
            System.out.println(n + 6);
        }
    }
}
