package com.company;

public class Main {

    public static void main(String[] args) {
//
//        // Int has a width of 32
//        int myMinValue= -2_147_483_648;
//        int myMaxValue= 2_147_483_647;
//        int myTotal = (myMinValue/2);
//        System.out.println("myTotal" + myTotal);
//
//        //Byte has a width of 8
//        byte myByteValue = -128;
//        byte myNewByteValue = (byte)(myByteValue/2);
//        System.out.println("myNewByteValue" + myNewByteValue);
//
//        //Short has a width of 16
//        short myShortValue = 32767;
//        short myNewShortValue = (short) (myShortValue/2);
//
//        //Lond has a width of 64
//        long myLongValue = 9_223_372_036_854_775_807L;

            byte newByteValue = 10;
            short newShortValue = 20;
            int newIntValue = 50;

            long totalValue = 50_000L + 10L * (newByteValue + newShortValue + newIntValue);

            short shortTotalValue = (short) (1_000 + 10*(newByteValue+newShortValue+newIntValue));

            System.out.println("Long result is " + totalValue);

            System.out.println("Short result is " + shortTotalValue);


    }
}
