package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        System.out.println();

        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        System.out.println("This is the same method (calculateScoreReturnInt). If true, prints: " +
                calculateScoreReturnInt(true, 800, 5, 100));

        int highScore = calculateScoreReturnInt(false, score, levelCompleted, bonus);
        System.out.println("Second time used method with false set. The result is: " + highScore);

        //
//        // another way to make the method mare readeble.
//
//        System.out.println();
//
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        calculateScore(gameOver, score, levelCompleted, bonus);




    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // void is - empty or nothing
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateScoreReturnInt(boolean gameOver, int score, int levelCompleted, int bonus) {
        // void is - empty or nothing
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}