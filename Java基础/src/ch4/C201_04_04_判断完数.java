package ch4;

import java.util.Scanner;

public class C201_04_04_判断完数 {
    public static void main(String[] args) {
        //输入一个自然数
//        System.out.println("请输入一个待判断的数");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        int sum = 0;


        for (int n = 2; n<1000; n++ ) {
            //计算因子之和
            sum = 0;
            for (int x = 1; x <= n/2; x++){
                if (n%x == 0){
                    sum += x;
                }
            }
            if (sum == n)
                System.out.printf("%4d",n);
        }

        //输出结果
        /*if (sum == n){
         *   System.out.printf("%d是完数",n);
        }else {
            System.out.printf("%d不是完数",n);
        }*/

//        System.out.printf("%d%s完数",n,sum==n?"是":"不是");

    }
}
