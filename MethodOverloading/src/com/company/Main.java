package com.company;

public class Main {

    public static void main(String[] args) {

//        System.out.println("The result is: (main) " + calcFeetAndInchesToCentimeters(2,6));
//        System.out.println("The result is: (main) " + calcFeetAndInchesToCentimeters(3,-6));
//        System.out.println("Inch in feet will be : " + calcFeetAndInchesToCentimeters(13));

        calcFeetAndInchesToCentimeters(1, 4);
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(-12);
        calcFeetAndInchesToCentimeters(0, 13);
        calcFeetAndInchesToCentimeters(302);
        calcFeetAndInchesToCentimeters(456431);


    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inch){

        if (feet < 0 || inch < 0 || inch > 12) {
            System.out.println("Invalid parameters");
        return -1;}

        double resultValue = (inch * 2.54) + (feet * 12 * 2.54);
        System.out.println(feet + " feet and " + inch + " inches = " + resultValue + " cm");

        return resultValue;
    }

    public static double calcFeetAndInchesToCentimeters (double inch){

        if (inch < 0 ) {
            System.out.println("Invalid parameter");
            return -1;
        }

        double feetValue = (int) inch / 12;
        double remainingInches = (int) inch % 12;

        return calcFeetAndInchesToCentimeters(feetValue, remainingInches);
    }


}
