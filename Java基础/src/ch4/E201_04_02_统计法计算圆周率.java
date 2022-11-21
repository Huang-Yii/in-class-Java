package ch4;

public class E201_04_02_统计法计算圆周率 {
    public static final int SUM = 100000;//循环的总次数
    public static void main(String[] args) {
        int num = 0;//循环的次数
        float count = 0;//圆内的计数
        double x = 0;//x坐标
        double y = 0;//y坐标
        while (num <= SUM){
            x = Math.random();
            y = Math.random();
            if(Math.sqrt(x*x+y*y)<1.0){
                count++;
            }
            num++;
        }
        System.out.printf("π = %f",count/SUM*4);
    }
}
