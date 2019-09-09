package com.lesson7;

public class Sharik {
    private int count;

    public Sharik(int count) {
        this.count = count;
    }

    public Sharik(String age) {
        this.age = age;
    }

    private String age;

    public Sharik() {
        int i = 5;
        System.out.println(i);
    }

    public static void main(String[] args) {
        new Sharik();
    }
}
