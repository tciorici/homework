package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert an integer");

        int value = sc.nextInt();

        if (value % 2 == 0){
            System.out.println(value + " is an Even number");}
        else{
            System.out.println(value + " is an Odd number");}
    }
}
