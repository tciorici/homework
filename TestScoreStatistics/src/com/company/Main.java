package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int studentScore = 0;
        int minStudentScore = 100;
        int maxStudentScore = 0;
        int counter = 0;
        double average = 0.0;
        boolean trueVariable = true;

        System.out.println("Insert values between 0 and 100 of students score, \nor value of 999 to end the list.");

        do {
            studentScore = sc.nextInt();
            if (studentScore == 999)
                {trueVariable = false; break;}

            if (studentScore < 0 || studentScore > 100){
                System.out.println("Error. Value is outside the range! Insert other one");
            } else{

                if (minStudentScore > studentScore) {
                    minStudentScore = studentScore;
                }
                if (maxStudentScore < studentScore) {
                    maxStudentScore = studentScore;
                }
                counter++;
                average = ((average + studentScore) / counter);
            }
        } while (trueVariable);

        System.out.println("\nTotal number of introduced valid students score is: " + counter);

        if (counter > 0) {
            System.out.println("Min student score is: " + minStudentScore);
            System.out.println("Max student score is: " + maxStudentScore);
            System.out.print("Arithmetic average of introduced score is: ");
            System.out.printf("%.2f", average);
            System.out.println();
        }

    }
}



