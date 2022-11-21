package ch4.C202_04_02_形状;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(1,1,5);
        System.out.printf("圆周长=%.2f\n",c.length());
        System.out.printf("圆面积=%.2f\n",c.area());

        Triangle t = new Triangle(0,0,0,4,3,0);
        System.out.printf("三角形周长=%.2f\n",t.length());
        System.out.printf("三角形面积=%.2f\n",t.area());

        calc(c);
        calc(t);
    }

    private static void calc(IShape t) {
        //this:当前Test类的对象
        System.out.printf("周长=%.2f\n",t.length());
        System.out.printf("周长=%.2f\n",t.area());

        calc(new IShape() {   //匿名内部类
            @Override
            public double length() {
                return 0;
                //特别注意this的含义,当前形状对象
            }

            @Override
            public double area() {
                return 0;
            }
        });

    }

}
