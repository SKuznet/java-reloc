package com.lesson10;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(getInfo());
    }

    private static int getInfo() {
        Integer i = 0;
        try {
            i = 5;
            throw new IllegalArgumentException();
        } catch (Exception e){
            i = null;
            return i;
        } finally {
            i = 15;
            return i;
        }
    }
}
