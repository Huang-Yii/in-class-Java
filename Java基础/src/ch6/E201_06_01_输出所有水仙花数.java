package ch6;

public class E201_06_01_输出所有水仙花数 {
    public static void main(String[] args) {
        for(int num=100 ; num<1000 ; num++){
            if(Num(num)==num){
                System.out.printf("%4d" , num);
            }
        }
    }

    /**
     * 用于计算各个位上与幂的和
     * @param num 传入一个三位数
     * @return 返回计算好的和与主函数的num比较
     */
    private static double Num(int num){
        double sum;
        int num1;//百位
        int num2;//十位
        int num3;//个位

        num1 = num / 100;
        num2 = num / 10 % 10;
        num3 = num % 10;
        sum=Math.pow(num1,3)+Math.pow(num2,3)+Math.pow(num3,3);
        return sum;
        }
}
