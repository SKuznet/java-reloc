package com.lesson3;

import java.util.Arrays;
import java.util.List;

public class CatWashService {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Barsik", "Murzik", "Riska");

        for (String cat : list) {
            System.out.println("Welcome to our service: " + cat);

            if(cat.equalsIgnoreCase("barsik")) {
                continue;
            }

            System.out.println("Clean the cat: " + cat);
        }

        int i = 0;
        while (true) {
            i++;

            if(i == 3) {
                continue;
            }

            System.out.println(i);

            if (i == 10) {
                break;
            }
        }
    }
}
