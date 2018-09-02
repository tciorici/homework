package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // not with flow control. Must be rewrite

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 integers");

        int lowestValue = sc.nextInt();
        int middleValue;
        int highestValue = lowestValue;

        int value =  sc.nextInt();
        if (value > highestValue ){
            highestValue = value;
        } else lowestValue = value;
        middleValue = value;

        value = sc.nextInt();
        if (value > highestValue){
            highestValue = value;
        } else if (value < lowestValue){
            middleValue = lowestValue;
            lowestValue = value;}

        System.out.println("Lowest middleValue is: " + lowestValue);
        System.out.println("Highest middleValue is: " + highestValue);
        System.out.println("Ascending " + lowestValue + " " + middleValue + " " + highestValue);
        System.out.println("Descending " + highestValue + " " + middleValue + " " + lowestValue);
    }
}
