package ch2;

import java.util.Scanner;

public class C201_02_05_判断天数 {
    public static void main(String[] args) {
        //从键盘输入年月日
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年：");
        int year = scanner.nextInt();
        System.out.println("请输入月：");
        int month = scanner.nextInt();
        System.out.println("请输入日：");
        int day = scanner.nextInt();
        //判断这一天是一年中的第几天
        int sumDays = 0;
        switch(month-1){
            case 11:
                sumDays += 30;//11月的总天数30
            case 10:
                sumDays += 31;//10月的总天数31
            case 9:
                sumDays += 30;//9月的总天数30
            case 8:
                sumDays += 31;//8月的总天数31
            case 7:
                sumDays += 31;//7月的总天数31
            case 6:
                sumDays += 30;//6月的总天数30
            case 5:
                sumDays += 31;//5月的总天数31
            case 4:
                sumDays += 30;//4月的总天数30
            case 3:
                sumDays += 31;//3月的总天数31
            case 2:
                if ((year % 4 ==0 && year % 100 !=0) || year % 400 ==0){
                    sumDays += 29;//闰年2月的总天数29
                }else{
                    sumDays += 28;//非闰年2月的总天数28
                }
            case 1:
                sumDays += 31;//1月的总天数31
        }
        //输出结果
        //System.out.println(year + "年" + month + "月" + day + "日是当年的第" + sumDays + "天");
        System.out.printf("%d");
    }
}

