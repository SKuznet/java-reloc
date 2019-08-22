package com.hw2;

//Дан текст. Верно ли, что в нем есть пять идущих подряд одинаковых символов?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zlat_9_74 {
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
            int countA = 1;
            String result = "не верно";
            for (int i = 0; i < name.length() - 1; i++) {
                if (name.charAt(i) == name.charAt(i + 1)) {
                    ++countA;
                    if (countA == 5) {
                        result = "верно";
                        break;
                    }
                } else {
                    countA = 1;
                }
            }
            System.out.println(result);
            System.out.println(countA);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
