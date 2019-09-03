package com.lesson6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsEx {
    public static void main(String[] args) {
        // Arrays - array
//        Collections.sort();
//       Collections.binarySearch()
//        Collections.reverse();
//        Collections.shuffle();
        List<String> list = new ArrayList<>();
        list.add("Barsik");
        list.add("Bars");
        list.add("Murzik");
        list.add("Murzik1");
        list.add("Murzik2");
        list.add("Murzik3");
        list.add("Murzik4");
//        Collections.fill(list, "Snegok");
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
//        Collections.rotate();
        Collections.replaceAll(list, "Barsik", "Bars");
        System.out.println(list);
        Collections.swap(list, 1, 4);
        System.out.println(list);
//        Collections.unmodifiableCollection()
        Collection listSet = Collections.synchronizedCollection(list);
        System.out.println(listSet);

        System.out.println(Collections.frequency(list, "Bars"));
//        Collections.newSetFromMap()
//        Collections.addAll()

//        Collections.disjoint()
    }
}
