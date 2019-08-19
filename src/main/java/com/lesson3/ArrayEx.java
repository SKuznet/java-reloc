package com.lesson3;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {

        // memory
        int[] price = new int[10];

        for (int i = 0; i < 5; i++) {
            price[i] = i;
        }

        System.out.println(Arrays.toString(price));

        int[] rooms = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(rooms));
        System.out.println(rooms.length);
        int[][] ax = new int[2][2];

        String[] arr = new String[3];
        arr[1] = "Barsik";
        System.out.println(Arrays.toString(arr));
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());

    }
}
