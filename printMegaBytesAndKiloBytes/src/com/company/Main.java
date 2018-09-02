package com.company;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(-2050);

    }

    public static void printMegaBytesAndKiloBytes (int amountOfKilobytes){

        int kiloBytes = 0;
        int megaBytes = 0;

        if (amountOfKilobytes < 0){
            System.out.println("Invalid Value");
        }else {
            megaBytes = amountOfKilobytes / 1024;
            kiloBytes = (amountOfKilobytes - (megaBytes * 1024));

            System.out.println( amountOfKilobytes + " KB = " + megaBytes + " MB and "
                    + kiloBytes + " KB");
        }

    }



}
