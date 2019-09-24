package com.lesson10;

public class ExceprionEx extends Exception {
    int detail;

    public ExceprionEx(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "ExceprionEx{" +
                "detail=" + detail +
                '}';
    }
}
