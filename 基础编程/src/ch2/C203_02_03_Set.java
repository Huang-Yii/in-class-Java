package src.ch2;

import java.util.HashSet;
import java.util.Set;

public class C203_02_03_Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(44);
        set.add(55);

        System.out.println(set);
        set.add(33);//33没被加进去,因为已经存在了
        System.out.println(set);

    }
}
