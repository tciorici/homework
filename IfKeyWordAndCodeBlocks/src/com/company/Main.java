package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score=5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000)
            System.out.println("Score = 5000");
        System.out.println();

        if (score == 5000) {
            System.out.println("Score = 5000");
            System.out.println("Give me more");
        }

        if (score <= 5000){
            System.out.println("Score is less or egal to 5000");
            int finalScore = score;
            System.out.println("This is variable finalScore, declared in if statement: " + finalScore);
        }

        /* System.out.println(finalScore); - this variable can't be printed here. Is declared in if statement. After {}
        */
        System.out.println();

        if (gameOver){ //this is egual to If (gameOver == true){

            int testValue = score;

            // System.out.println("Print value from if 2 " + myValueFromIf2); - from next if statement value can't be reach

            if (score > 1000){

                System.out.println("This is a variable declared in a previos if. The value is: " + testValue);

                int myValueFromIf2 = 10;
            }
            else {
                System.out.println("The score is less than 1000. The score is " + score);
            }
        }




        // Exercise time
        System.out.println("______________________________________________");
        System.out.println();
        System.out.println();



        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
            System.out.println();
        }

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Second final score is: " + finalScore);

        }













    }
}
