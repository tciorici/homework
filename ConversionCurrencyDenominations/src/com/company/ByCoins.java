package com.company;

import java.util.Scanner;

public class ByCoins {

    // unfinished. how to extract only number that is before floating point ???

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean trueValue = true;
        double amountOfDollars = 0;

        while (trueValue){
            System.out.println("Introduce a sum of dollars!");
            amountOfDollars  = sc.nextDouble();

            if (amountOfDollars > 0 && amountOfDollars >= 0.01) {
                trueValue = false;
            } else {
                System.out.println("\nNot a valid number\n");
            }
        }

        double dividerBy0_25 = (amountOfDollars / 0.25);
        double dividerBy0_10 = (amountOfDollars - (0.25 * dividerBy0_25))/0.1;
        double dividerBy0_05 = (amountOfDollars - (0.25 * dividerBy0_25) - (0.1 * dividerBy0_10))/0.05;
        double dividerBy0_01 = (amountOfDollars - (0.25 * dividerBy0_25) - (0.1 * dividerBy0_10) -
                (0.05 * dividerBy0_05))/0.01;

        System.out.println("The amount of $ " + amountOfDollars + " will consist of " + dividerBy0_25 +
                " coins of 25 and " + dividerBy0_10 + " coins of 10 and " + dividerBy0_05 + " coins of 5 and "
                + dividerBy0_01 + " coins of 1 cent");
    }

}
