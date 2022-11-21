package ch7;

public class C201_07_01_小球反弹 {
    public static void main(String[] args) {
        double s = 100;//经过的距离
        double h = 50;//反弹的高度

        for (int retry = 2; retry <= 10; retry++) {
            s += h*2;
            h /= 2;
        }
        System.out.printf("第10次落下经过的距离为%.2f,反弹高度为%.2f",s,h);
    }
}
