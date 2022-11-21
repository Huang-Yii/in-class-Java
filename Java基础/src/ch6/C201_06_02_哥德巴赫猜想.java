package ch6;

public class C201_06_02_哥德巴赫猜想 {
    public static void main(String[] args) {
        for (int n = 8; n < 10000; n+=2) {
           int x1 = split(n);
           if (x1 == 0){
               System.out.println("哥德巴赫猜想验证失败");
           }else {
               System.out.printf("%d=%d+%d\n",n,x1,n-x1);
           }
        }
    }

    /**
     * 将偶数分解为两个质数之和
     * @param n 待分解的偶数
     * @return 分解后的质数之一, 0表示分解失败
     */
    private static int split(int n) {
        //对于x∈[3,n/2],如果x和n-x都是质数,则找到分解方案
        for (int x = 3; x <= n/2; x += 2){
            if (isPrime(x) && isPrime(n-x)){
                return x;
            }
        }
        return 0;
    }

    /**
     * 判断素数
     * @param x 待判断的数
     * @return true-是素; false-不是素数
     */
    private static boolean isPrime(int x) {
        for (int m = 2; m <= Math.sqrt(x); m++){
            if (x%m == 0){
                return false;
            }
        }
        return false;
    }

}
