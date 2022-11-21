package src.ch1;

import java.util.Arrays;

public class C203_01_02_Arrays {
    public static void main(String[] args) {
        int []arr = {66,89,32,45,11,72,33};
        Arrays.sort(arr);;
        for (int x:arr){
            System.out.printf("%4d",x);
        }
        System.out.println();
        int val = 89;
        int index = Arrays.binarySearch(arr,val);
        if (index < 0){ //返回一个负数则没找到
            System.out.printf("%d不存在于数组",val);
        }else {
            System.out.printf("%d存在于数组的%d号位置",val,index);
        }
    }
}
