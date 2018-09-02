package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Let's test it ");
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
        System.out.println(bark(false, -2));
        System.out.println(bark(true, 14));

    }

    public static boolean bark(boolean barking, int hourOfDay) {

        if (hourOfDay >= 0 && hourOfDay <= 23) {

            if (barking == true && hourOfDay < 8 || hourOfDay >22) {
                return true;
            } else return false;
        } else return false;
    }
}

