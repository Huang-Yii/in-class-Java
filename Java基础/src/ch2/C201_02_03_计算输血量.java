package ch2;

import java.util.Scanner;

public class C201_02_03_计算输血量 {
    public static void main(String[] args) {
        //输入血红蛋白含量和体重
        System.out.println("请输入血红蛋白含量和体重");
        Scanner scanner = new Scanner(System.in);
        int hb = scanner.nextInt();
        int weight = scanner.nextInt();
        int mlPerKg;//单位体重输血量
        int blood = 0;//输血量


        //判断血红蛋白含量并计算输血量
        /*if(hb < 30){
         *   blood = 7*weight;
            System.out.printf("输血量为%dml",blood);
            return;
        }else if (hb < 60){
            blood = 10*weight;
            System.out.printf("输血量为%dml",blood);
            return;
        }
        blood = 15*weight;
        System.out.printf("输血量为%dml",blood);*/

        if(hb < 30){
            mlPerKg = 7;
        }else if (hb <60){
            mlPerKg = 10;
        }else {
            mlPerKg = 15;
        }

        blood = mlPerKg*weight;
    }
}
