package ch6;

import java.util.Scanner;

class Result{
    int max;
    int min;

public class C201_06_04_验证三位卡布列克常数 {
/*    public static void main(String[] args) {
 *       for (int n = 100; n < 999; n++) {
            int x = 0;
            do {
                n = x;
                x = differenceOfMixMax(n);
            } while (x != 495);
//            System.out.printf("%d验证成功",n);
        }
        System.out.printf("卡布列克常数验证成功");
    }

    /**
     *
     * @param num 接受n的值进行卡布列克常数的验证
     * @return 返回进行一次卡布列克常数计算的差值
     */
/*    private static int differenceOfMixMax(int num) {
 *       //分解
        int b100 = num/100;
        int b10 = (num%100)/10;
        int b1 = num%10;

        //重组
        int max = Math.max(Math.max(b100,b10),b1);
        int min = Math.min(Math.min(b100,b10),b1);
        int mid = b100+b10+b1-max-min;
        int valMax = max*100+mid*10+min;
        int valMin = min*100+mid*10+max;
        System.out.printf("%d-%d = %d",valMax,valMin,valMax-valMin);
        return valMax-valMin;
    }

 */

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位不全相同的三位数");
        int n = scanner.nextInt();

        Result res = new Result();
        res.max = 0;
        res.min = 0;
        do {
            res = recombination(n);
            int diff = res.max- res.min;
            System.out.printf("%d:%d-%d=%d\n",n,res.max,res.min,diff);
            n = diff;
        }while (n!=495);
    }

    /**
     * 数据重组,重组出最大和最小的三位数
     * @param n 待重组的数
     * @return 重组的结果,包括最大和最小的三位数
     */
    private static Result recombination(int n) {
        //分解
        int b100 = n/100;
        int b10 = (n%100)/10;
        int b1 = n%10;

        //重组
        int max = Math.max(Math.max(b100,b10),b1);
        int min = Math.min(Math.min(b100,b10),b1);
        int mid = b100+b10+b1-max-min;
        int val = max*100+mid*10+min;

        Result res = new Result();
        res.max = max*100+mid*10+min;
        res.min = min*100+mid*10+max;
        return res;
    }

}
