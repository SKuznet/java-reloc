package com.lesson7;

public class Ex1 {
    private int x;
    private int y;

    public Ex1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ex1() {
        this.x = 2;
    }

    public Ex1(int size) {
        this(size, 2);
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1(1);
        System.out.println(ex1.x);
        System.out.println(ex1.y);
    }
}
