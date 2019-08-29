package com.lesson5;

import java.util.Set;
import java.util.TreeSet;

public class SetEx3 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Bars");
        set.add("Murz");
        set.add("Ara");

        System.out.println(set);

        set.add("Aara");
        set.add("Mu");

        System.out.println(set);

        System.out.println(((TreeSet<String>) set).headSet("Mu"));
        System.out.println(((TreeSet<String>) set).first());
    }
}
