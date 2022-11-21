package ch4;

import java.util.Scanner;

public class C201_04_06_讨厌的数字3 {
    public static void main(String[] args) {
        //输入一个三位数
        System.out.println("请输入一个三位数");
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();

        for (int n = 100; n <= 999; n++){
            if (n%3 == 0){//优先排除3的倍数,代价最小,放最前
                continue;
            }
            if(n/100 == 3){//排除个位为3
                continue;
            }
            if (n%10 == 3){//排除百位为3
                continue;
            }
            if (n%100/10 == 3){//排除十位为3,代价最大,放最后
                continue;
            }
            System.out.printf("%4d",n);
        }

    }
}
