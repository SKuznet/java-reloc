package com.lesson3;

public class SwitchEx {
    public static void main(String[] args) {
        SwitchEx switchEx = new SwitchEx();
        System.out.println(switchEx.getMonthNumber("Jan"));
        switchEx.getWrongLog("jun1");
    }

    private int getMonthNumber(String month) {
        int result;
        switch (month) {
            case "Jan":
                result = 1;
                break;
            case "Feb":
                result = 2;
                break;
            default:
                throw new IllegalArgumentException("Wrong month");
        }

        return result;
    }

    // don't do this
    private void getWrongLog(String month) {
        switch (month) {
            case "jan":
                System.out.println("jan");
            case "feb":
                System.out.println("feb");
            default:
                System.out.println("default");
            case "jun":
                System.out.println("jun");
            case "jul":
                System.out.println("jul");
        }
    }
}
