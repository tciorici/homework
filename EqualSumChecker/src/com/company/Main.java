package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,2,3));
        System.out.println(hasEqualSum(-5,5,0));
        System.out.println(hasEqualSum(1,2,4));

    }

    public static boolean hasEqualSum (int a, int b, int c){

        if ((a + b) == c ) return true;
        else return false;
    }

}
