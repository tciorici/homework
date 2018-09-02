package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberValue;

        do {
            System.out.println("\nPlease introduce an even number or tipe 999 to exit the program!\n");
            numberValue = sc.nextInt();

            if (numberValue % 2 == 0) {
                System.out.println("Introduced number: " + numberValue + " - is even. Good job!");
            } else {
                if (numberValue != 999){
                    System.out.println("Introduced number: " + numberValue + " - is odd. Error message :) ");}
                    else {System.out.println("\nYou quit the program!");}
            }
        } while (numberValue != 999);

    }
}
