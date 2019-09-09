package com.lesson7;

public interface CatI {
    default void getVoice() {
        System.out.println("Mur");
    }

    default void same() {
        System.out.println(2);
    }
}
