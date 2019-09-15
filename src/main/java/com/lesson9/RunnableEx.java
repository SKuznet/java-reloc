package com.lesson9;

public class RunnableEx implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " hello from");
    }
}
