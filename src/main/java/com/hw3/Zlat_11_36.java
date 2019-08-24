package com.hw3;

//Дан массив. Напечатать:
//а) все неотрицательные элементы;
//б) все элементы, не превышающие число 100
public class Zlat_11_36 {
    private static int[] array = new int[]{10, -20, 300, 40, 50};

    public static void main(String[] args) {
        printAllPositive(array);
        printAllLess100(array);
    }

    public static void printAllPositive(int[] array) {
        System.out.println("все неотрицательные элементы:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printAllLess100(int[] array) {
        System.out.println("все элементы, не превышающие число 100:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 100) System.out.print(array[i] + " ");
        }
    }

}
