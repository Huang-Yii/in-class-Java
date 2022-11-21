package ch4;

import java.util.Scanner;

public class C201_04_07_输出图形 {
    public static void main(String[] args) {
        //System.out.println("输入星号的列数");
        Scanner scanner = new Scanner(System.in);
        //int cols = scanner.nextInt();
        System.out.println("输入星号的行数");
        int rows = scanner.nextInt();

        for (int row = 1; row <= 2*rows-1; row++) {
            int blanks = Math.abs(rows-row);
            //输出(行数-行号)的绝对值个空格
            for (int col = 1; col <= blanks; col++){
                System.out.print(" ");
            }

            //输出(两倍行数-1)再减掉空格个数的星号
            int stars = 2*rows-1-2*blanks;
            for (int col = 1;col <= stars;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
