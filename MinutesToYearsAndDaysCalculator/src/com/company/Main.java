package com.company;

import java.lang.*;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes){

        if (minutes < 0){
            System.out.println("Invalid Value");}

            else {
            long years = minutes / 60 / 24 / 365;
            long days = ((minutes - (years * 24 * 60 * 365)) / 60 / 24);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

}
