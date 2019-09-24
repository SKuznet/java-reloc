package com.lesson10;

import java.io.*;
import java.nio.file.AccessDeniedException;

public class Ex3 {
    public static void main(String[] args) {
        File file = new File("");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            try {

            } catch (Exception e) {

            } finally {
                try {

                } catch (Exception e) {

                }
            }
            reader.readLine();
        } catch (FileNotFoundException | AccessDeniedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
