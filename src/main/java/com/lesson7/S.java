package com.lesson7;

public class S {
    private static S ourInstance = new S();

    public static S getInstance() {
        return ourInstance;
    }

    private S() {
    }
}
