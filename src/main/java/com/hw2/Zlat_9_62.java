package com.hw2;

//Дано предложение. Определить долю (в %) букв а в нем

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zlat_9_62 {
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
            int countA = 0;
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == 'а') {
                    countA++;
                }
            }
            System.out.println(countA *100/ name.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
