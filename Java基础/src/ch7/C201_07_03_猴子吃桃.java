package ch7;

public class C201_07_03_猴子吃桃 {
    public static void main(String[] args) {
        int n = 1;//第十天剩下一个桃子
        for (int day = 9; day >= 1; day--) {
            n = (n+1)*2;
        }
        System.out.printf("第一天桃子数量=%d",n);
    }
}
