package com.company;

public class Main {

    public static void main(String[] args) {

        for(int numberValue = 1; numberValue <= 10000; numberValue++) {

            int sumOfDivider = 0;

            for (int i = 1; i < numberValue/2+1; i++) {
                if (numberValue % i == 0) {
                    sumOfDivider += i;
                }
            }
        if (sumOfDivider == numberValue)
            System.out.println(numberValue);
        }
    }
}

