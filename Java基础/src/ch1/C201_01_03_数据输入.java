package ch1;

import java.util.Scanner;

public class C201_01_03_数据输入 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();

        System.out.println(name);
        System.out.println(age);
    }
}
