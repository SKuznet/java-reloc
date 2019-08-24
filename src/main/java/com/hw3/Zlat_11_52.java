package com.hw3;

import java.util.Arrays;

//Дан массив целых чисел.
//а) Все элементы, содержащие цифрой 4, уменьшить вдвое.
//б) Все четные элементы заменить на их квадраты, а нечетные удвоить.
//в) Четные элементы увеличить на a, а из элементов с четными номерами
//вычесть b.
public class Zlat_11_52 {
    private static int[] array = new int[]{10, -21, 300, 40, 50};

    public static void main(String[] args) {
        logicA(array);
        logicB(array);

    }

    public static boolean isContain4(int num) {
        while (num > 0) {
            num = num - 4;
            if (num % 10 == 0) return true;
            else num=(num-(num%10))/10;
        }
        return true;
    }

    public static void logicA(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = array[i] * array[i];
            } else array[i] = 2 * array[i];
        }

        System.out.println(Arrays.toString(array));
    }

    public static void logicB(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isContain4(array[i])) {
                array[i] = array[i] / 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
