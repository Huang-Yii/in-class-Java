package ch5;

import java.util.Scanner;

public class E201_05_01_成绩统计 {
    public static void main(String[] args) {
        System.out.println("请输入学生成绩");
        Scanner scanner = new Scanner(System.in);
        float []scores = new float[5];
        float sum = 0;
        float max = 0;
        float min = 100;
        for (int i = 0; i < 5; i++) {
            scores[i] = scanner.nextFloat();
            sum += scores[i];
        }
    }
}
