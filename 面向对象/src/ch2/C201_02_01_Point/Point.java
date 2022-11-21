package ch2.C201_02_01_Point;
//静态属性
public class Point {
    private double x;//横坐标
    private double y;//纵坐标

    public  Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

//动态行为
    public void init(double x,double y){
        this.x = x;
        this.x = y;
    }
    /**
     * 计算两点之间的距离
     * @param p 指定的一个点
     * @return 距离
     */
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }

    /**
     * 输出
     */
    public void print(){
        System.out.printf("(%.2f,%.2f)",x,y);
    }

    public double deltaX(Point p2) {
        return this.x - p2.x;
    }

    public double deltaY(Point p2) {
        return this.y - p2.y;
    }
}
