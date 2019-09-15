package com.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private final int count = 9;
    private final List<String> list = new ArrayList<>();

    private void helper() {
//        list.add("Barsik");
//        System.out.println(list);
//
//        list = new ArrayList<>();

    }

    public static void main(String[] args) {
        Main main = new Main();
        Dog dog = new Dog() {
            @Override
            void getInfo() {

            }
        };
        main.helper();
//        Runtime.getRuntime().gc();
//        System.gc();
    }
}
