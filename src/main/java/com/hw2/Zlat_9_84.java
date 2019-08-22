package com.hw2;
//Дано предложение. Определить порядковые номера первой пары одинаковых соседних символов.
// Если таких символов нет, то должно быть напечатано со-ответствующее сообщение.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zlat_9_84 {
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
            int count = 0;
            for (int i = 0; i < name.length() - 1; i++) {
                if (name.charAt(i) == name.charAt(i + 1)) {
                    System.out.println("первые соседние символы: " + i + " " + (i + 1));
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("нет одинаковых соседних символов");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
