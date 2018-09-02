package com.company;

import java.lang.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(155,55));
        System.out.println(getDurationString(86400));
    }

    public static String getDurationString (int minutes, int seconds){

        if (minutes < 0 || seconds < 0 || seconds >59){
            return "Invalid value";}

        int hours = (int) minutes / 60;
        int minValue = (int) (minutes - (hours * 60));
        return (hours + "h " + minValue + "m " + seconds + "s" );
    }

    public static String getDurationString (int seconds){

        if (seconds < 0 ){
            return "Invalid value";}

        int minutes = (int) seconds/ 60;
        int secValue = (int) (seconds - (minutes* 60));

        return getDurationString(minutes, secValue);
    }

}
