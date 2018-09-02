package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(2.0, 2.0001));

    }

    public static boolean areEqualByThreeDecimalPlaces (double a, double b){

        int valueA = (int) (a * 1000);
        System.out.println(valueA);

        int valueB = (int) (b * 1000);
        System.out.println(valueB);

        if (valueA == valueB) return true;
        else return false;
    }
}
