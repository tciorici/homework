package com.company;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//
//        System.out.println("Using while");
//        while (count !=5){
//            System.out.println("Count value is: "+count );
//            count++;
//        }
//
//        System.out.println("Using for" + count);

//        do {
//            i++;
//
//        } while (++i > 20);
//        System.out.println(i);

    int number = 1234321;
    int reverseNumber = 0;

    for (; number > 0; number/=10 ){
        int remainder = number % 10;
        reverseNumber = reverseNumber*10 + remainder;

    }
        System.out.println(reverseNumber);

    while (number>0){

        reverseNumber = reverseNumber*10 + number % 10;
        number/=10;
    }
        System.out.println(reverseNumber);

    }
}
