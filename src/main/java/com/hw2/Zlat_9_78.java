package com.hw2;
//Дано слово. Проверить, является ли оно "перевертышем" (перевертышем на-зывается слово, читаемое одинаково как с начала, так и с конца).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zlat_9_78 {
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
            String result = "верно";
            for (int i = 0; i < name.length() / 2 - 1; i++) {
                if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                    result = "не верно";
                }
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

