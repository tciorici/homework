package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int popMexico = 121;
        double incPopRatioMexico = 1.0101;
        int popUsa = 315;
        double incPopRatioUsa = 1.0015;

        System.out.println("\nIn 2018 Population of:\nMexico is " + popMexico
                + " mln" + "\nUSA is " + popUsa + " mln");

        int year = 2018;
        double newPopMexico = popMexico;
        double newPopUsa = popUsa ;

        System.out.println("\nYear " + "  Mexico" + "  USA");

        while (newPopMexico < newPopUsa){

            year++;
            newPopMexico = newPopMexico * incPopRatioMexico;
            newPopUsa = newPopUsa * incPopRatioUsa;

            System.out.print(year + " ");
            System.out.printf("%7.1f", newPopMexico);
            System.out.printf("%8.1f", newPopUsa);
            System.out.println();
        }
        System.out.print("\nBy the year " + year + " Mexico's population will be greater then USA's one\n");
    }
}
