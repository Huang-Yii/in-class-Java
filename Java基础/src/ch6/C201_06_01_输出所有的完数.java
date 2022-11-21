package ch6;

public class C201_06_01_输出所有的完数 {
    public static void main(String[] args) {
        //假定系统提供了一个判断完数的函数,那么问题变得异常简单
        for (int n = 2; n < 1000; n++) {
            //alt+F6
            if(isFull(n)) {
                System.out.printf("%4d", n);
            }
        }
    }

    private static boolean isFull(int n) {
        int sum = 0;
        for (int x = 1; x <= n/2; x++){
            if (n%x == 0){
                sum += x;
            }
        }
        return (sum == n);
    }
}
