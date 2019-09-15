package com.lesson8;

import java.util.Objects;

public class ObjectEx {
    private static int[] array = new int[]{1, 2};
    private String name = "barsik";

    public static void main(String[] args) {
        ObjectEx ex = new ObjectEx();
        System.out.println(ex);
//        System.out.println(array);
        // recommend
        System.gc();
        Runtime.getRuntime().gc();
        System.runFinalization();
        System.runFinalization();

        System.out.println(ex.getClass().getName() + "@" + Integer.toHexString(ex.hashCode()));

        // all methods Object
        //clone toString notify notifyAll wait equals hashCode finalize

        // Рефлексивность
        // симметричность x.equals(y) y.equals(x)
        // транзитивность x e. y ; y e. z; x e. z
        // непротиворечивость
        // ненулевая ссылка
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectEx objectEx = (ObjectEx) o;
        return Objects.equals(name, objectEx.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
