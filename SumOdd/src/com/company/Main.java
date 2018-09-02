package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isOdd(2));
        System.out.println(isOdd(-1));

        System.out.println("Sum of odd numbers from 1 to 100 is " +
                sumOdd(1, 100));



    }

    public static boolean isOdd (int number){

        if (number < 0) return false;

        if (number % 2 != 0){
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd (int start, int end){

        if (start < 0 || end < 0 || (start > end)){
            return -1;
        }

        int sum = 0;

        for (int i=start; i <= end; i++){

            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;


    }
}
