package com.lesson5;

import java.util.HashSet;
import java.util.Set;

public class SetEx5 {
    public static void main(String[] args) {
        Set<Dog> set = new HashSet<>();
        Dog barsik = new Dog("Barsik", "good");
        Dog murzik = new Dog("Murzik", "angry");

        set.add(barsik);
        set.add(murzik);

        System.out.println(barsik.hashCode());

        System.out.println(set);
    }
}
