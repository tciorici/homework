package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        System.out.println("\nThis is using while");
        while (count !=6){

            System.out.println("Count value is: " + count);
            count++;
        }

        System.out.println("\nThis is using for");

        count =1;
        for (count =1; count <=5; count++)
            System.out.println("Count value is: " + count);

        System.out.println("\nThis is using while with break");
        count=1;
        while (true) {
            if (count == 6)
                break;

            System.out.println("Count value is: " + count);
            count++;
        }

        System.out.println("\nThis is using do while");
        count=1;
        do {
            System.out.println("Count value is: " + count);
            count++;
        } while (count !=6);


        System.out.println("\nThis is using an infinit loop, do while and break set to 10");
        count=6;
        do {
            System.out.println("Count value is: " + count);
            count++;
            if (count > 10) break;

        } while (count !=6);







        System.out.println("\nThe rest of the code was not executed beacause of incorect parameters set!!!");
        for (int i = 6; i!=6; i++){ //i = 6 and i is not equal to 6
            System.out.println("Print this!");
        }

        count =6;
        while (count !=6){ //count = 6 and count is not equal to 6

            System.out.println("Count value is: " + count);
            count++;
        }


    }
}
