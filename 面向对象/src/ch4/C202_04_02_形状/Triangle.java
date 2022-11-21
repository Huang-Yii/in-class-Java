package ch4.C202_04_02_形状;

import ch2.C201_02_01_Point.Point;

public class Triangle implements IShape{
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    private Point p1;
    private Point p2;
    private Point p3;



    public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
        this.p3 = new Point(x3,y3);
    }

    @Override
    public double length() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        return a+b+c;
    }

    @Override
    public double area() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        double l = (a+b+c)/2.0;
        return Math.sqrt(l*(l-a)*(l-b)*(l-c));
    }
}

