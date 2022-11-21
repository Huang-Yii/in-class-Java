package ch2;

import java.util.Scanner;

public class C201_02_04_分制转换 {
    public static void main(String[] args) {
        //输入百分制分数
        System.out.println("请输入百分制分数");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        //转换五分制
        String level;
        switch (score/10){
            case 10:
            case 9:
                level = "A";
                break;
            case 8:
                level = "B";
                break;
            case 7:
                level = "C";
                break;
            case 6:
                level = "D";
                break;
            default:
                level = "E";
                break;
        }

        //输出五分制结果
        System.out.printf("百分制%d的五分制为%s",score,level);

    }
}
