package ch4;

public class E201_04_03_计算数列之和 {
    public static void main(String[] args) {
        double num = 1;//分子
        double deno = 2;//分母
        double fraction = 0.5;//分数
        double sum = 0;//和
        int i = 1;//计数
        while (i <= 20){
            sum += fraction;
            double t = deno;
            deno += num;
            num = t;
            fraction = num/deno;
            i++;
        }
        System.out.printf("和为%f",sum);
    }
}
