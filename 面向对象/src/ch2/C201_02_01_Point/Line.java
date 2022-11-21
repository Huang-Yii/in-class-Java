package ch2.C201_02_01_Point;

public class Line {
    //静态属性
    private Point p1;
    private Point p2;

    //动态行为

    /**
     * 给线段赋值
     *
     * @param p1 线段的其中一个点
     * @param p2 线段的另一个点
     */
    public void init(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * 求线段的长度
     *
     * @return 线段长度
     */
    public double length() {
        return p1.distance(p2);
    }

    /**
     * 判断两个线段是否平行
     *
     * @param line 指定的一条线段
     * @return true-平行，false-不平行
     */
    public boolean isParallel(Line line) {
        double slope1 = (this.p1.deltaY(this.p2)) / (this.p1.deltaX(this.p2));
        double slope2 = (line.p1.deltaY(line.p2)) / (line.p1.deltaX(line.p2));

        //在程序中，不能直接判断两个浮点数是否相等，而是判断他们相差的精度是否很小
        //if(Math.abs(slope1-slop2) < 1e-6)
        return Double.compare(slope1, slope2) == 0;
    }
}
