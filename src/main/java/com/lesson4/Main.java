package com.lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Stack
//        Vector
//        Hashtable
//        BitSet

        Hashtable<String, String> map = new Hashtable<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "4");
        map.put("5", "Cat");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "9");
        map.put("10", "10");

        Collection c = map.values();
        Iterator iterator = c.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

}
