package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("We wont to find how many times is possible to multyple 2 by 2 in out java program");
        System.out.println();

        int a = 2, b =1;
        for (; a > 0 ; a = a * 2, b++){
            System.out.println(a);
        }
        System.out.println("This was " + b + " times multipled by 2, for a int variable!");
        System.out.println();

        long c = 2L, d =1;
        for (; c >0; c = c *2, d++){
            System.out.println(c);
        }
        System.out.println("This was " + d + " times multipled by 2, for a long variable!");

    }
}
