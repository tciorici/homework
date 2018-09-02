package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many meal for adults do you want to buy?");
        int adultMeal = sc.nextInt();
        System.out.println("And for children?");
        int childMeal = sc.nextInt();

        System.out.println(adultMeal + " adult meals for $ 7 = " + adultMeal * 7);
        System.out.println(childMeal + " children meals for $ 4 = " + childMeal * 4);
        System.out.println("Total money collected: $ " + ((adultMeal*7) + (childMeal*4)) );

    }
}
