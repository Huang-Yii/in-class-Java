package ch2.C201_02_01_Point;

public class Test {
    public static void main(String[] args) {
        //存放对象的地址    对象
        Point p1 = new Point(0,0);//p1不是对象,而是对象的引用
        Point p2 = new Point(2,3);
        Point p3 = new Point(1,1);
        Point p4 = new Point(3,5);
        Point p5 = new Point(p4);
        p4.print();
        p5.print();

//        p1.init(0,0);
//        p2.init(2,3);
//        p3.init(1,1);
//        p4.init(3,4);

//        p1.print();
//        p2.print();

//        double d = p1.distance(p2);
//        System.out.println(d);

//        Line line1 = new Line(p1,p2);
//        Line line2 = new Line(0,0,3,4);

//        line1.init(p1,p2);
//        line2.init(0,0,3,4);

//        System.out.println(line1.lenghth());
//        System.out.println(line2.lenghth());

        int x = 3;
        double y = 3.14;
        System.out.println(x);
        System.out.println(y);

    }
}
