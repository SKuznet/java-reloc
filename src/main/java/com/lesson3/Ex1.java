package com.lesson3;

import java.util.Arrays;

//11.17. Дан массив. Все его элементы:
//а) увеличить в 2 раза;
//б) уменьшить на число А;
//в) разделить на первый элемент.
public class Ex1 {
    private static int[] array = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i]);
//        }

        int[] supArr = new int[array.length];
        int[] supArr2 = new int[array.length];
        int[] supArr3 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            supArr[i] = multiplyByTwo(array[i]);
            supArr2[i] = reduceValByDif(array[i], 1);
            supArr3[i] = divideBy(array[i], array[0]);
        }

        System.out.println(Arrays.toString(supArr));
        System.out.println(Arrays.toString(supArr2));
        System.out.println(Arrays.toString(supArr3));


    }

    public static int multiplyByTwo(int val) {
        return val * 2;
    }

    public static int reduceValByDif(int val, int dif) {
        return val - dif;
    }

    public static int divideBy(int val, int div) {
        return val / div;
    }
}
