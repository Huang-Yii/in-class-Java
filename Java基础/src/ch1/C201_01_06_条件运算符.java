package ch1;

import java.util.Scanner;

public class C201_01_06_条件运算符 {
    public static void main(String[] args) {
        //判断并输出一个数的奇偶性
        System.out.println("请输入一个自然数");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //常规写法
        /*if (num%2 == 0){
         *   System.out.printf("%d是偶数\n",num);
        }else {
            System.out.printf("%d是奇数",num);
        }*/

        //推荐写法(可以用条件运算符代替)
        System.out.printf("%d是%s\n",num,num%2==0?"偶数":"奇数");

    }
}
