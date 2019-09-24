package com.lesson10;

public class Ex1 {
    public static void main(String[] args) {
        getRes(getInfo());
    }

    private static String getInfo() {
        return null;
    }

    private static void getRes(String param) {
        if (param != null) {
            System.out.println(param.contains("a"));
        }

        throw new IllegalArgumentException("param is null");

        // wrong construction
//        try {
//            System.out.println(param.contains("a"));
//        } catch (NullPointerException e) {
//            System.err.println("param " + e);
//        }

    }

}
