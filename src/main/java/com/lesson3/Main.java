package com.lesson3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        while (true) {
            break;
        }

        do {
            System.out.println();
            break;
        } while (true);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        List<String> list = Arrays.asList("Barsik", "Murzik");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
