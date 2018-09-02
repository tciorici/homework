package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce a possitive number from 1 to 20!");
        int number = sc.nextInt();
        System.out.println();

            long numberFactorial = 1L;

            for (int i = 1; i <= number; i++) {
                numberFactorial *= i;}

        System.out.println(number + "! (Factorial) is: " + numberFactorial);
    }

}

