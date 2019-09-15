package com.lesson9;

@FunctionalInterface
public interface FuncEx {
    public static final int count = 1;

    static void getS() {
        System.out.println(1);
    }

    static void getS1() {
        System.out.println(1);
    }

    default void getA() {
        System.out.println("a");
    }

    String getInfo(String name);
}
