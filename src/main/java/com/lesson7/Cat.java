package com.lesson7;

public class Cat extends Animal implements AniI, CatI {
    private String name;

    public Cat(String name) {
        this.name = name;
        super.name = name;
    }

    public static void main(String[] args) {
        Animal cat = new Cat("bars");
        Cat cat2 = new Cat("bars");
        System.out.println(cat.name);
        System.out.println(cat2.name);
    }
}
