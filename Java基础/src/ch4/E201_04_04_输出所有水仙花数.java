package ch4;

public class E201_04_04_输出所有水仙花数 {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            int firstNum = i/100;
            int secondNum = i/10%10;
            int thirdNum = i%10;
            if(Math.pow(firstNum, 3) + Math.pow(secondNum, 3)+Math.pow(thirdNum, 3) == i){
                System.out.println("The narcissus number is：" + i);
            }
        }
    }
}
