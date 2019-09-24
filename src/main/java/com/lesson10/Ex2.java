package com.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println(1);
        } finally {
            System.out.println(2);
        }

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(reader.readLine());
        }

    }
}
