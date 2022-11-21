package ch4.C202_04_02_形状;

import ch2.C201_02_01_Point.Point;

public class Circle implements IShape{
private Point p;
private double radius;

    public Circle(Point p, double radius) {
        this.p = p;
        this.radius = radius;
    }
    public Circle(double x, double y, double radius) {
        this.p = new Point(x,y);
        this.radius = radius;
    }

    @Override
    public double length() {
        return 2*Math.PI*radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
