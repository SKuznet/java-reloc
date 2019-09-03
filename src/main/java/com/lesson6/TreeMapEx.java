package com.lesson6;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Barsik", "Barsik");
        map.put("Murzik", "Murzik");

        System.out.println(map.lastKey());
        System.out.println(map.firstKey());


    }

}
