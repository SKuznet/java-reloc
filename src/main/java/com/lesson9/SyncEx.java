package com.lesson9;

public class SyncEx {
    private final Object key = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableEx());
        thread.start();

        ThreadEx threadEx = new ThreadEx();
        threadEx.start();


        System.out.println(Thread.currentThread().getName());
    }

    // principle toilet
    private synchronized void getToilet() {

    }

    private void getInfo() {
        System.out.println();

        synchronized (key) {

        }

        System.out.println();
    }
}
