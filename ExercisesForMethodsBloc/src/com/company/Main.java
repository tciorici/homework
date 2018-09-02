package com.company;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Player1", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Player2", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Player3", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Player4", highScorePosition);

    }

    public static void displayHighScorePosition(String playersName, int playerPosition){

                System.out.println( playersName + " managed to get into possition " + playerPosition +
                " on the high score table");
    }


    public static int calculateHighScorePosition (int score){

        if (score >= 1000){return 1;}
            else if (score >= 500) {return 2;}
                     else if ( score >= 100) {return 3;}
        return 4;}

}
