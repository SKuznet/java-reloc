package com.lesson4;

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("barsik");
        list.addLast("barsik");
        list.listIterator();

        // recommend
        List<String> list2 = new ArrayList<>();

        list2.addAll(list);
        ArrayList<String> list3 = new ArrayList<>(1000000);
        list.add("nBar");
        list.add("nBar");
        list.add("nBar");
        list.add("nBar");
        list.add("nBar");

        list3.trimToSize();



    }
}
