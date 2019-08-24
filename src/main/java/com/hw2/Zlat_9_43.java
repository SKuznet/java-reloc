package com.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Дано слово s1. Получить слово s2, образованное нечетными буквами слова s1.
public class Zlat_9_43 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            doSomething(reader);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void doSomething(BufferedReader reader) {
        try {
            String name = reader.readLine();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < name.length(); i++) {
                if (i % 2 != 0) {
                    result.append(name.charAt(i));
                }
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
