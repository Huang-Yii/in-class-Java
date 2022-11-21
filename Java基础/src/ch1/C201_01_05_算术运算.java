package ch1;

public class C201_01_05_算术运算 {
    public static void main(String[] args) {
        /*
        *代码规范
        * (1)赋值运算符左右加空格
        * (2)在合适的地方加上空行增强程序的可读性,体现逻辑上的分隔
        * (3)合理使用注释
        * */
        //除法应注意一般除法和整除
        /*int d = 10;
        *int h = 12;
        //double area = 1/2*d*h;//(错误)
        double area = 1.0/2*d*h;//(正确)
        System.out.printf("三角形的面积=%.2f",area);*/

        //控制数据呈现周期性变化(比如时针)
        int hour = 0;
        for (int x = 0; x <100; x++) {
            System.out.printf("%2d\n",hour);
            /*hour++;
            *if (hour >= 12){
                hour = 0;
            }*/
            hour = (hour+1)%12;
        }
    }
}
