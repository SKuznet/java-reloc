package com.lesson8;

public class Main3 {
    private int count;

    public static void main(String[] args) {
        Main3 main3 = new Main3();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    main3.getCount();
                }

                System.out.println(main3.count);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    main3.getCount();
                }

                System.out.println(main3.count);
            }
        });
        thread3.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    main3.getCount();
                }

                System.out.println(main3.count);
            }
        });
        thread.start();
        thread2.start();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(main3.count);
    }

    // toilet
    synchronized void getCount() {
        count = count++;
    }
}
