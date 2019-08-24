package com.hw3;

import java.util.Arrays;

//Дан массив целых чисел. Выяснить:
//а) верно ли, что сумма элементов массива есть четное число;
//б) верно ли, что сумма квадратов элементов массива есть пятизначное число.
public class Zlat_11_29 {
    private static int[] array = new int[]{10, 20, 30, 40, 50};

    public static void main(String[] args) {
        isSumAllElementEvenNumber(array);
        isSumSquareMore10000(array);
    }

    public static void isSumAllElementEvenNumber(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.print(sum+ " ");
        System.out.println(sum % 2 == 0 ? "четное" : "нечетное");
    }

    public static void isSumSquareMore10000(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * array[i];
        }
        System.out.print(sum+ " ");
        System.out.println(sum / 10000 >= 1 ? "пятизначное число" : "не пятизначное число");
    }


}
