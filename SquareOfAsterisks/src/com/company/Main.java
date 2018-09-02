package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please introduce the size of square!");
        int size = sc.nextInt();

            System.out.println("Introduced size is: " + size);
            System.out.println();

        for (int i = 1; i <= size; i++) {

            if (i == 1 || i == size){
                for (int j = 1; j<= size;j++) System.out.print("*");
            } else {
                for (int j = 1; j <= size; j++) {
                    if (j == 1 || j == size) System.out.print("*");
                    else System.out.print(" ");} }
        System.out.println();}
    }
}

