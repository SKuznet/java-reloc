package com.lesson9;

public class Cat extends Animal {
    @Override
    public void getInfo(String name) {
        System.out.println(name + 1);
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        Cat cat1 = new Cat();

        cat.getInfo("Barsik");
        cat1.getInfo("Barsik");

        System.out.println(cat instanceof Animal);
        System.out.println(cat1 instanceof Animal);
    }
}
