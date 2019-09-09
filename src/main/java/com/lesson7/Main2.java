package com.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) {
        CatService catService = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            if (reader.readLine().equals("barsik")) {
                catService = new CatServiceImpl1();
            } else {
                catService = new CatServiceImpl2();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (catService != null) {
            catService.getInfo();
        } else {
            throw new IllegalArgumentException("catService shouldn't be null");
        }
    }
}
