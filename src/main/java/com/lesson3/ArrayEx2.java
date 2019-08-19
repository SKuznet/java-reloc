package com.lesson3;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[10];

        int[][] twoDim = new int[4][2];
        int val = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                val++;
                twoDim[i][j] = val;
            }
        }

        System.out.println(Arrays.toString(twoDim));
        System.out.println(Arrays.deepToString(twoDim));
    }
}
