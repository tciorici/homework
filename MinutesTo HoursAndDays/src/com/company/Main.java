package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce a number of minutes to convert in hours and days");

        int minutes = sc.nextInt();

        double numberOfHours = minutes / 60;
        double numberOfDays = numberOfHours / 24;

        System.out.println("Introduced number of " + minutes + " minutes converted in hours and days will be:");
        System.out.printf("%.1f", numberOfHours);
        System.out.print(" hours or\n");
        System.out.printf("%.3f", numberOfDays);
        System.out.print(" days");

    }
}
