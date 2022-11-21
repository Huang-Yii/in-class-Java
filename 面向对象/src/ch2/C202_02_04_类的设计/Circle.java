package ch2.C202_02_04_类的设计;

import ch2.C201_02_01_Point.Point;

public class Circle {
        private Point p;//圆心
    private  double radius;//半径

    //构造函数
    public Circle(Point p,double radius){
        this.p = p;
        this.radius = radius;
    }
    public Circle(double x,double y,double radius){
        this.p = new Point(x,y);
        this.radius = radius;
    }
    public double length(double r){
        return 2*Math.PI*r;
    }
    public double area(){
        return Math.PI*radius*radius;
    }

    /**
     * 判断两个圆的位置关系
     * @param c
     * @return 0-相离; 1-外切; 2-相交; 3-内含; 4-相交
     */
    public int position(Circle c){
        double d = this.p.distance(c.p);//圆心距离
        double sum = this.radius+c.radius;//半径之和
        double sub = Math.abs(this.radius-c.radius);//半径之差

        if (Double.compare(d,sum)==0){
            return 0;
        }
        if (Double.compare(d,sub)==0){
            return 1;
        }
        if (d>sum){
            return 2;
        }
        if (d<sub){
            return 3;
        }
        return 4;
    }

}
