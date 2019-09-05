package com.hw5;
import java.util.*;
public class Hw5Main {
    public static void main(String[] args) {
//        Collection
//                Set
//        HashSet
//                SortedSet
//        NavigableSet
//                TreeSet
        Set<String> set = new HashSet<>();
        set.size();
        set.isEmpty();
        set.contains("Barsik");
        set.add("Barsik");
        set.add("Barsik");
        set.add("aarsik");
        set.add("qarsik");
        set.add("rsik");
        //      set.remove("barsik");
        Iterator<String> iterator = set.iterator();

        System.out.println(set);

        set.remove("qarsik");
        //      set.removeIf(O -> O.equals("qarsik"));
//        while (iterator.hasNext()) {
//            //     if (iterator.next() != null) {
//            if (iterator.next().equals("Barsik")) {
//                iterator.remove();
//            }
//        }
//        //      }
        System.out.println(set);
        List<String> list = new ArrayList<>();
        list.add("Barsik");
        list.add("rsik");
        System.out.println(set.containsAll(list));
    }
}
