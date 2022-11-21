package ch4;

public class E201_04_06_输出100以内的素数 {
    public static void main(String[] args) {
        int n=100;
        int i=0;
        for(i=2;i<n;i++) {
            boolean flag=true;
            for (int j = 2; j < i/2+1; j++) {
                if (i%j==0) {
                    flag=false;
                }
            }
            if (flag==true) {
                System.out.println(i+" is prime");
            }
        }
    }
}
