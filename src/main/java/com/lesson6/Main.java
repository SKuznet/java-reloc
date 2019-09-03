package com.lesson6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        Hashtable
//        HashMap
//        LinkedHashMap
//        SortedMap
//                NavigableMap
//        TreeMap

        map.put("Barsik", "Barsik the cat");
        map.put(null, "Barsik the cat");
        map.get("Barsik");
        System.out.println(map.containsKey("Barsik"));
        System.out.println(map.containsValue("Barsik the cat"));
        System.out.println(map.containsValue("Barsik the cat1"));
        System.out.println(map.size());
        map.remove("Barsik");

        System.out.println(map.containsKey(null));
        System.out.println(map.get(null));

        System.out.println(map.size());
    }
}
