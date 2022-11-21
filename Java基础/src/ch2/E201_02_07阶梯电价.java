package ch2;

import java.util.Scanner;

public class E201_02_07阶梯电价 {
    public static final float PRICE1=0.4463f;
    public static final float PRICE2=0.4663f;
    public static final float PRICE3=0.5663f;
    public static void main(String[] args) {
        System.out.println("请输入月用电量(千瓦)：");
        Scanner scan = new Scanner(System.in);
        float electricityConsumption = scan.nextFloat();
        float price =0f;
        if(electricityConsumption<=150){
            price = electricityConsumption*PRICE1;
        }
        if(electricityConsumption>150&&electricityConsumption<=400){
            price = 150*PRICE1+(electricityConsumption-150)*PRICE2;
        }
        if(electricityConsumption>400){
            price = 150*PRICE1+250*PRICE2+(electricityConsumption-400)*PRICE3;
        }
        System.out.println("你需要支付的电费为："+price);
    }
}
