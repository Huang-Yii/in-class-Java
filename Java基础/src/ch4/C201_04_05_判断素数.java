package ch4;

import java.util.Scanner;

public class C201_04_05_判断素数 {
    public static void main(String[] args) {
        //输入一个自然数
//        System.out.println("请输入一个待判断的数");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();

        boolean isPrime = false;//因为否定更容易,所以先肯定它
        for (int n = 1; n <= 100;n++) {
            isPrime = true;
            for (int x = 2; x <= Math.sqrt(n); x++){
                if (n%x == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%4d\n", n);
            }
        }

    }
}
