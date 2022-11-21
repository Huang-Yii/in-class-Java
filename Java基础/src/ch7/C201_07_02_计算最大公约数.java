package ch7;

import java.util.Scanner;

public class C201_07_02_计算最大公约数 {
    public static void main(String[] args) {
        System.out.println("请输入要计算最大公约数的两个数");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int n = gcd(n1,n2);
        System.out.printf("%d和%d的最大公约数是%d",n1,n2,n);
    }

    /**
     * 计算最大公约数
     * @param n1
     * @param n2
     * @return
     */
    private static int gcd(int n1, int n2) {
        int d1 = Math.max(n1,n2);//被除数
        int d2 = Math.min(n1,n2);//除数
        while (true){
            int d0 = d1%d2;
            if(d0 == 0){
                break;
            }
            d1 = d2;//原来的除数作为新的被除数
            d2 = d0;//原来的余数作为新的除数
        }
        return d2;
    }
}
