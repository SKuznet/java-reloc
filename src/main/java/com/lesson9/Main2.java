package com.lesson9;

public class Main2 {

    public static void main(String[] args) {
        FuncEx funcEx = new FuncEx() {
            @Override
            public String getInfo(String name) {
                return name.toUpperCase();
            }
        };

        System.out.println(getName(funcEx));

        System.out.println(getName(O -> O.toUpperCase()));
    }

    private static String getName(FuncEx funcEx) {
        return funcEx.getInfo("Barsik");
    }
}
