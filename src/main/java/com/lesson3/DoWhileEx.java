package com.lesson3;

public class DoWhileEx {
    public static void main(String[] args) {

        boolean isTrue = false;

        do {
            System.out.println("I am doing something...");
        } while (isTrue);

        // do not recommend change i !!!
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k);
                }
            }
            System.out.println(i);
        }

    }
}
