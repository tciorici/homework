package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("First 5 numbers divided by 3 and by 5 are:");
        sumNumbersDiv3And5();

    }

    public static void sumNumbersDiv3And5 (){

        int counter = 0;
        int sumValue = 0;

        for (int i = 1; i <= 1000; i++){

            if ((i % 3 == 0) && (i % 5 == 0) ){
                System.out.println(i);
                sumValue += i;
                counter++;
            }
            if (counter == 5) {i=1001;}
        }
        System.out.println("Total sum is: " + sumValue);
    }
}
