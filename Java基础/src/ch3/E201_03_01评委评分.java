package ch3;

import java.util.Scanner;

public class E201_03_01评委评分 {
    public static void main(String[] args) {
        System.out.println("请依次输入5个评委的评分在（0-100）：");
        Scanner scan = new Scanner(System.in);
        int score1 = scan.nextInt();
        int score2 = scan.nextInt();
        int score3 = scan.nextInt();
        int score4 = scan.nextInt();
        int score5 = scan.nextInt();

        int min = 100;
        if(score1 < min){
            min = score1;
        }
        if(score2 < min){
            min = score2;//修改最小值
        }
        if(score3 < min){
            min = score3;//修改最小值
        }
        if(score4 < min){
            min = score4;//修改最小值
        }
        if(score5 < min){
            min = score5;//修改最小值
        }
        int max = 0;
        if(score1 > max){
            max = score1;
        }
        if(score2 > max){
            max = score2;//修改最大值
        }
        if(score3 > max){
            max = score3;//修改最大值
        }
        if(score4 > max){
            max = score4;//修改最大值
        }
        if(score5 > max){
            max = score5;//修改最大值
        }
        int total = score1+score2+score3+score4+score5;
        float ave = (total-max-min)/3f;//得到小数点后两位小数的平均值

        System.out.printf("五位评委评分的平均分为%.2f",ave);//输出结果
    }
}
