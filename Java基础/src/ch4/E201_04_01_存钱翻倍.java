package ch4;

public class E201_04_01_存钱翻倍 {
    public static void main(String[] args) {
        double sum = 10000;
        int year;
        for (year = 0; sum < 20000; year++) {
            sum *= 1.03;
        }
        System.out.printf("存%d年",year);
    }
}
