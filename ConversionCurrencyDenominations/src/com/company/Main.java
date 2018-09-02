package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce an amount of dollars");

        int amountValue = sc.nextInt();

        System.out.println("You introduced amount of $ " + amountValue);

        int divisor20 = amountValue/20;
        int divisor10 = (amountValue - (divisor20 * 20))/10;
        int divisor5 = (amountValue - (divisor20 * 20) - (divisor10 * 10))/5;
        int divisor1 = (amountValue - (divisor20 * 20) - (divisor10 * 10) - (divisor5 * 5));


        System.out.println("\nThis will be " + divisor20 + " papers of $ 20 and "
        + divisor10 + " papers of $ 10 \nand " + divisor5 + " papers of $ 5 and "
        + divisor1 + " papers of $ 1");

    }
}
