package com.lesson6;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Cat murzik = new Cat("Murzik");

        Map<Cat, String> map = new HashMap<>();
        map.put(murzik, "Murzik");
        map.put(barsik, "Barsik");

        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.isEmpty());

        Map<Cat, String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);
//        map2.clear();
        System.out.println(map2);
        System.out.println(map2.values());
        System.out.println(map2.keySet());


    }
}
