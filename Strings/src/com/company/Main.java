package com.company;

public class Main {

    public static void main(String[] args) {

        // byte short int long float double char boolean


        String myString = "This is the string";
        System.out.println(myString);

        System.out.println(myString + " and more");

        myString = myString + " and even more!";

        System.out.println(myString);

        myString = myString + " \u00A9 2018";

        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";

        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;

        lastString = lastString + " " + myInt;

        System.out.println(lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;

        System.out.println("Last string will be a " + lastString);

    }
}
