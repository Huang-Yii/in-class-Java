package ch4;

public class C201_04_02_计算圆周率 {
    //sum 和 = 0
    //fraction 分数 = 1
    //num 分子 = 1
    //deno 分母 = 1

    //条件 |fraction| >= 10^-6

    //sum += fraction

    //分母加二 分子取反 分数 = 分子/分母
    public static void main(String[] args) {
        double sum = 0;//和
        double fraction = 1;//分数
        int num = 1;//分子
        int deno = 1;//分母
        while (Math.abs(fraction) >= 1e-6){
            sum += fraction;

            deno += 2;
            num = -num;
            fraction = num*1.0/deno;
        }
        System.out.printf("π=%.8f",sum*4);
    }
}
