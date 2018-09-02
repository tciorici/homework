package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean trueValue = true;
        int numberOfEggs = 0;

        while (trueValue){
            System.out.println("How many eggs do you wont to buy?");
            numberOfEggs = sc.nextInt();

                if (numberOfEggs > 0) {
                    trueValue = false;
                } else {
                    System.out.println("\nNot a valid number\n");
                }
        }

        int numberOfDozen = numberOfEggs / 12;
        int numberOfLooseEggs = numberOfEggs % 12;
        double totalCost = (numberOfDozen * 3.25) + (numberOfLooseEggs * 0.45);

        if (numberOfLooseEggs == 0){
            System.out.println("\nYou ordered " + numberOfEggs + " eggs. That's " +
                    numberOfDozen + " dozen at $ 3.25 per dozen for a total of $ " + totalCost);
        }else if (numberOfDozen == 0){
            System.out.println("\nYou ordered " + numberOfEggs + " eggs. That's " + numberOfLooseEggs +
                    " loose eggs at 45 cents each for a total of $ " + totalCost);
            }else
            {
            System.out.println("\nYou ordered " + numberOfEggs + " eggs. That's " +
                    numberOfDozen + " dozen at $ 3.25 per dozen and " + numberOfLooseEggs +
                    " loose eggs at 45 cents each for a total of $ " + totalCost);
            }
    }
}
