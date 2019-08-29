package com.lesson5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Barsik1");
        set.add("Barsik2");

        List<String> list = new ArrayList<>();
        list.add("barsik3");
        list.add("barsik4");

        set.addAll(list);

        System.out.println(set);

//        set.removeAll(list);
//        System.out.println(set);
        set.retainAll(list);
        System.out.println(set);
        set.clear();

        System.out.println(set);

        set.toArray();
    }
}
