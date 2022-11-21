package src.ch2;

import java.util.*;

public class C203_02_05_Iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        for (Integer x:list){
            System.out.printf("%4d",x);
        }
        System.out.println();

        Iterator<Integer> iterator = list.iterator();//迭代器
        while (iterator.hasNext()){
            int x = iterator.next();
            System.out.printf("%4d",x);
        }
        System.out.println();
        System.out.println(Collections.max(list));
    }
}
