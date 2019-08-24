package com.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(1000);
        list.add("barsik");
        list.add("murzik");
        list.add("barsik");
        list.add("barsik");
        list.add("snegok");

        // never delete element from collection with foreach
//        for (String val : list) {
//            if (val.equalsIgnoreCase("barsik")) {
//                list.remove(val);
//            }
//        }
//
          // since java 1.8
//        list.removeIf(O -> O.equals("barsik"));
//        System.out.println(list);
        Iterator iterator = list.iterator();

        // before java 1.8
        while (iterator.hasNext()) {
            if (iterator.next().equals("barsik")) {
                iterator.remove();
            }
        }

        System.out.println(list);


        List<String> list2 = Arrays.asList("barsik", "murzik", "barsik", "barsik", "riska");
//        System.out.println(list2);
        list2.add("sharik");
//        Iterator iterator2 = list2.iterator();

//        while (iterator2.hasNext()) {
//            if (iterator2.next().equals("barsik")) {
//                iterator2.remove();
//            }
//        }

        System.out.println(list2);

    }
}
