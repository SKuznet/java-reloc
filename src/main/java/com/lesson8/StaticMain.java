package com.lesson8;

import java.util.ArrayList;

public class StaticMain {
    private static int count = 0;
    private int count1;
    private int count2;
    private int count3 = 0;


    public StaticMain(int count2, int count3) {
        this.count2 = count2;
        this.count3 = count3;
    }

    public StaticMain() {
        this(1, 2);
    }

    static {
        System.out.println(count);
    }

    public static void main(String[] args) {

        System.out.println(new StaticMain().count1);
    }

    native int getCount();

}
