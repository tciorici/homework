package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number (positive or negative)");

        int diagona = sc.nextInt();

            if (diagona > 0) {

                for (int i = 1; i <= diagona; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("O");
                }
            } else {
                for (int i = diagona; i <= -1; i++) {
                    for (int j = -1; j >= i; j--) {
                        System.out.print(" ");
                    }
                    System.out.println("O");
                }
            }
    }
}

