package com.lesson7;

public interface AniI {
    default void getWeight() {
        System.out.println(1);
    }

    default void same() {
        System.out.println(1);
    }
}
