package ch2;

import java.util.Scanner;

public class E201_02_04按性别计算输血量 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入性别：");
        String sex = scan.nextLine();
        System.out.println("请输入体重(kg)：");
        int result=0;
        float weight = scan.nextFloat();
        if("男".equals(sex)){
            if(weight<=60)
                result=250;
            else
                result = 300;
        }
        else  if("女".equals(sex)){
            if(weight<=50){
                result = 200;
            }
            else{
                result = 250;
            }
        }
        else {
            System.out.println("请输入正确的性别！（男/女）");
        }
        System.out.println("你的输血量为："+result+"ml");
    }
}
