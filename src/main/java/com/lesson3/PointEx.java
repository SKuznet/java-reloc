package com.lesson3;

public class PointEx {
    public static void main(String[] args) {
//        ColoredPoint[] cpa = new ColoredPoint[10];
//        Point[] pa = cpa;
//        System.out.println(pa[1]);
//        Point point = new ColoredPoint();
//        pa[0] = point;

        Object[] arr = new String[2];

        System.out.println(arr.hashCode());
        arr[0] = String.valueOf(new Integer(2));
        System.out.println(arr.hashCode());

    }
}
