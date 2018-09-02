package com.company;

public class Main {

    public static void main(String[] args) {

        int palindromNumer = 34543;
        int safeCopyPalindromNumber = palindromNumer;
        int inversedPalindrom = 0;

        for (; palindromNumer >0; palindromNumer /=10 ){

            inversedPalindrom = inversedPalindrom * 10 + palindromNumer % 10;
        }

        System.out.println();
        System.out.println("Introduced number was: " + safeCopyPalindromNumber);
        System.out.println("Inversed number is: " + inversedPalindrom);
        System.out.println();

        if (safeCopyPalindromNumber == inversedPalindrom){
            System.out.println("The number " + safeCopyPalindromNumber + " is a palindrom!");
        }
        else System.out.println("The number " + safeCopyPalindromNumber + " is NOT a palindrom!");





    }
}
