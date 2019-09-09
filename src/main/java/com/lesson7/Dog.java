package com.lesson7;

import java.util.ArrayList;
import java.util.List;

public final class Dog {
    volatile String name = "Sharik";
    final List<String> list = new ArrayList<>();

    final void getSpace() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.list.add("B");
        dog.list.add("1");
        dog.list.add("A");
        dog.list.add("2");
    }

}
