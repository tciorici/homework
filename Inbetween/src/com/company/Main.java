package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce please 2 integers!");
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();

        System.out.println("Values are: " + value1 + " & " + value2);

        if ((value1 - value2) > 0 || (value2 - value1)  > 0 ) {

            if (value1 > value2) {

                for (; value1 > value2; value1--) {
                    System.out.println(value1);
                }
                System.out.println(value2);
            } else {
                for (; value2 > value1; value2--) {
                    System.out.println(value2);
                }
                System.out.println(value1);
            }
        } else {
            System.out.println("Are no integers between introdused values!");
        }


        }


    }
