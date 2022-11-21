package ch2;

import java.util.Scanner;

public class E201_02_09_判断体型 {
    public static void main(String[] args) {
        //输入身高和体重
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入体重：（kg)");
        float weight = scanner.nextFloat();
        System.out.println("请输入身高：（米）");
        float height = scanner.nextFloat();
        float BMI = weight/height;
        //判断体型并描述输出
        if(BMI<18.5){
            System.out.println("体重过低！");
        }
        else if(BMI<25){
            System.out.println("正常！");
        }
        else if(BMI<30){
            System.out.println("肥胖前期！");
        }
        else if(BMI<35){
            System.out.println("I度肥胖！");
        }
        else if(BMI<40){
            System.out.println("II度肥胖！");
        }
        else{
            System.out.println("III度肥胖！");
        }

    }
}
