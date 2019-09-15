package com.lesson8;

import com.lesson6.Cat;

public class Main {
    private int count;

    {
        count = 1;
    }
    {
        count = 2;
    }
    {
        Cat cat = new Cat("b");
        System.out.println(cat.hashCode());
        count = 3;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.count);
    }


}
