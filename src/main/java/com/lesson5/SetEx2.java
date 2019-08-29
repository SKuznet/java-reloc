package com.lesson5;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Barsik1");
        set1.add("Barsik2");

        Set<String> set2 = new HashSet<>();
        set2.add("Barsik1");
        set2.add("Barsik3");

        System.out.println(set1.equals(set2));

        // don't do this **
        Set<Character[]> set;
    }
}
