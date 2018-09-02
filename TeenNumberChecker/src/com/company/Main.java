package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasTeen(1,13, 20));
        System.out.println(hasTeen(11,-2, 20));
        System.out.println(hasTeen(1,20, 19));

    }

    public static boolean hasTeen (int a, int b, int c){

        if ( a <= 19 && a >= 13 ) return true;
        if ( b <= 19 && b >= 13 ) return true;
        if ( c <= 19 && c >= 13 ) return true;

        return false;
    }

}
