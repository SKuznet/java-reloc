package com.hw3;

import java.util.Arrays;

//Дан массив. Все его элементы:
//а) уменьшить на 20;
//б) умножить на последний элемент;
//в) увеличить на число В.
public class Zlat_11_18 {
    private static int[] array = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {
        int[] supArr = new int[array.length];
        int[] supArr2 = new int[array.length];
        int[] supArr3 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            supArr2[i] = reduceValByDif(array[i], 20);
            supArr[i] = multiplyByNumber(array[i], array[array.length - 1]);
            supArr3[i] = increaseValByDif(array[i], 20);
        }
        System.out.println(Arrays.toString(supArr2));
        System.out.println(Arrays.toString(supArr));
        System.out.println(Arrays.toString(supArr3));


    }

    public static int multiplyByNumber(int val, int lastNumber) {
        return val * lastNumber;
    }

    public static int reduceValByDif(int val, int dif) {
        return val - dif;
    }

    public static int increaseValByDif(int val, int dif) {
        return val + dif;
    }
}
