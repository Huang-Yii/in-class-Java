package ch2.C202_02_04_类的设计;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(0,0,5);
        Circle c2 = new Circle(1,0,3);
        System.out.println(c1.position(c2));
//        System.out.printf("周长=%.2f\n",c1.length(10));
    }
}
