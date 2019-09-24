package com.lesson10;

import java.io.IOException;

public class Main2 {

    //try catch throw throws finally
    public static void main(String[] args) {
        // recommend to catch before user
        try {
            getInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getInfo() throws IOException {
        throw new IOException();
    }
}
