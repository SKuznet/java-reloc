package com.lesson10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // checked unchecked
        System.out.println(getInfo());
//        Throwable
    }

    private static String getInfo() {
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
//            System.err.println((e);
        }

        return "hello";
    }
}
