package ch2;

import java.util.Scanner;

public class E201_02_12_四则运算器 {
    public static void main(String[] args) {
        //输入操作符和操作数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要进行的运算：（加减乘除）");
        String symbol = scanner.nextLine();
        System.out.println("请输入第一个数据：");
        float num1 = scanner.nextFloat();
        System.out.println("请输入第二个数据：");
        float num2 = scanner.nextFloat();
        float result =0f;

        //进行加减乘除运算
        switch(symbol){
            case "加":result = num1+num2;break;
            case "减":result = num1-num2;break;
            case "乘":result = num1*num2;break;
            case "除":
                if(num2==0){
                    System.out.println("除数不能为0：");
                }else{
                    result = num1/num2;
                }break;
            default:
                System.out.println("请输入加减乘除运算!");break;
        }
        //输出结果
        System.out.println("运算结果为: "+result);
    }
}
