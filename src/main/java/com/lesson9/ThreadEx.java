package com.lesson9;

public class ThreadEx extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " hello from");
    }
}
