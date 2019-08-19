package com.lesson3;

import java.time.Instant;

public class InstEx {
    public static void main(String[] args) {
        Cat cat = new Barsik();
        Barsik barsik = new Barsik();
        Cat cat1 = new Murzik();

        System.out.println(cat instanceof Barsik);
        System.out.println(barsik instanceof Barsik);
        System.out.println(barsik instanceof Cat);
        System.out.println(cat1 instanceof Barsik);

        InstEx ex = new InstEx();
        ex.checkAccess(cat);
        ex.checkAccess(cat1);

    }

    private void checkAccess(Cat cat) {
        if(cat instanceof Barsik) {
            System.out.println("You can enter");
        } else if ((cat instanceof Murzik)) {
            System.out.println("access restrict");
        }
    }
}
