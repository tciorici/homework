package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("This will print a diamond");
        System.out.println();

        for  (int i=0; i<10; i++){

            if (i == 1 || i == 9) { System.out.println("    *    ");}
            if (i == 2 || i == 8) { System.out.println("   ***   ");}
            if (i == 3 || i == 7) { System.out.println("  ******  ");}
            if (i == 4 || i == 6) { System.out.println(" ******** ");}
            if (i == 5)           { System.out.println("**********");}
        }

    }

}

