package com.lesson5;

import java.util.HashSet;
import java.util.Set;

public class SetEx4 {

    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        Cat barsik = new Cat("Barsik", "good");
        Cat murzik = new Cat("Murzik", "angry");

        set.add(barsik);
        set.add(murzik);

        System.out.println(barsik.hashCode());

        System.out.println(set.contains(barsik));
        barsik.setName("Bars");
        System.out.println(barsik.hashCode());
        System.out.println(set.contains(barsik));

        set.add(barsik);
        System.out.println(set.contains(barsik));

        System.out.println(set);

        Set<Cat> set2 = new HashSet<>(set);
        System.out.println(set2);
    }
}
