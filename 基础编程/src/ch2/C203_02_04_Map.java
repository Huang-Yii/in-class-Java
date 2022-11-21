package src.ch2;

import java.util.HashMap;
import java.util.Map;

public class C203_02_04_Map {
    public static void main(String[] args) {
        Drink drink1 = new Drink("茅台",3000);
        Drink drink2 = new Drink("二锅头",20);

        Map<String ,Drink> map = new HashMap<>();
        map.put("邵老师",drink1);
        map.put("法外狂徒张三",drink2);

        Drink d1 = map.get("法外狂徒张三");
        System.out.println(d1);
        Drink d2 = map.get("邵老师");
        System.out.println(d2);
        Drink d3 = map.get("张三");
        System.out.println(d3);
    }
}
