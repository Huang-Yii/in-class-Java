package src.ch2;

import java.util.ArrayList;
import java.util.List;

public class C203_02_01_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//实现一个动态数组,可添加,删除元素
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        int x = list.get(2);
        System.out.println(x);
        System.out.println(list); //直接输出数组,无需自己遍历

        list.add(1,99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
