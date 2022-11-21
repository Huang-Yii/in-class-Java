package ch5;

import java.util.Scanner;

public class C201_05_02_多项式相乘 {
    public static void main(String[] args) {
        //输入两个多项式
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个多项式");
        System.out.println("最高项次数");
        int n1 = scanner.nextInt();
        int []p1 = new int[n1+1];
        for (int i = 0; i < n1; i++){
            System.out.printf("%d次项系数",n1-i);
            p1[n1-i] = scanner.nextInt();
        }
        System.out.println("请输入第二个多项式");
        System.out.println("最高项次数");
        int n2 = scanner.nextInt();
        int []p2 = new int[n2+1];
        for (int i = 0; i < n2; i++){
            System.out.printf("%d次项系数",n2-i);
            p1[n2-i] = scanner.nextInt();
        }

        //计算多项式
        int []p3 = new int[n1+n2+1];
//        for (int n = 0; n < p3.length; n++){
//            int index_p1 = Math.min(n,n1);
//            for (int i = index_p1; i >= 0; i--){
//                int index_p2 = n-index_p1;
//                if(index_p2<0 || index_p2>n2){
//                    break;
//                }
//                p3[n] += p1[index_p1]*p2[index_p2];
//                index_p1--;
//            }
//        }
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                p3[i+j] += p1[i] + p2[j];
            }
        }

        //输出结果
        System.out.print(")x(");
        for (int i = p1.length; i >= 0; i--){
            if (i< p1.length-1){
                System.out.print("+");
            }
            System.out.printf("%dx(%d)",p1[i],i);
        }
        System.out.print(")=");

    }
}
