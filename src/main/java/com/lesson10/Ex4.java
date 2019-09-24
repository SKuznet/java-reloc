package com.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
