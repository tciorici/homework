package com.company;

public class Main {

    public static void main(String[] args) {

//        //width of int = 32 (4 bytes)
//        int myIntValue = 5/3;
//        //width of float = 32 (4 bytes)
//        float myFloatValue = 5f / 3f;
//        //width of double = 64 (8 bytes)
//        double myDoubleValue = 5d / 3d;
//
//        System.out.println("myIntValue is " + myIntValue);
//        System.out.println("myFloatValue is " + myFloatValue);
//        System.out.println("myDoubleValue is " + myDoubleValue);@


        double nrOfPounds = 20d;
        double ratioPoundKilogram = 0.45359237d;
        double nrOfKilograms = nrOfPounds * ratioPoundKilogram;

        System.out.println("Introduced number of pounds will be: " + nrOfKilograms + " kilograms");

//       double pi = 3.141_592_7d;
//        System.out.println(pi);
    }
}
