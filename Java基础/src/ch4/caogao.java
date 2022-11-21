package ch4;

public class caogao {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double n = 0;
        double x = 1.0;
        double y = 2.0;
        double sum = 0;
        while (n < 20.0) {
            sum = sum + x / y;
            double t = y;
            y = x + y;
            x = t;
            n = n + 1;
        }
        System.out.println("The sum of the series is " + sum);

    }
}