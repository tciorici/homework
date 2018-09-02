package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 25));
        System.out.println(isCatPlaying(true, 44));
        System.out.println(isCatPlaying(true, 46));
        System.out.println(isCatPlaying(false, 26));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 44));

    }

    public static boolean isCatPlaying (boolean summer, int temperature){

        if (summer == true){
            if (temperature > 45 || temperature < 25){
                return false;
            } else return true;

        }
        else{ if (temperature > 35 || temperature < 25){
            return false;
            } else return true;

        }


    }

}
