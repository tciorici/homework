package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

       int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previosResult = result;

        result = result - 1;
        System.out.println(previosResult + " - 1 = " + result);

        previosResult = result;

        result = result * 5;
        System.out.println(previosResult + " * 5 = " +result);

        previosResult = result;

        result = result / 2;
        System.out.println(previosResult + " / 2 = " + result);

        previosResult = result;

        result = result % 4;
        System.out.println(previosResult + " % 4 = " + result + " ceea ce ramane dupa cate numere intregi incap in valoarea initiala");

        previosResult = result;

        result += 1;
        System.out.println(previosResult + " += "+ result + " (increments 1)");

        int i = 5;
        i =+ 1;
        System.out.println("Daca schimbam ordinea din += in =+ atunci obtinem: " + i);

        previosResult=result;

        result -= 1;

        System.out.println(previosResult + " -= " + result + " decriments 1");

        previosResult = result;

        result++;
        System.out.println(previosResult + " result++ = " + result);

        previosResult=result;
        result--;
        System.out.println(previosResult + " result-- " + result);

        previosResult=result;
        result += 9;
        System.out.println(previosResult + " result+=9 " + result);

        previosResult=result;
        result-=5;
        System.out.println(previosResult + " result-=5 " + result);

        previosResult=result;
        result *=10;
        System.out.println(previosResult + " result*=10 " + result);

        System.out.println();

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("Nu e adevar!");

        System.out.println();

        int topScore = 100;
        if ((topScore > 110) || (topScore > 80))
            System.out.println("Test for 'or' past");

        if((topScore > result) && (topScore >= 100))
            System.out.println("Test && past");

        int newValue = 50;
        if( newValue == 50)
         System.out.println("this is true");

        boolean isCar = false;
        if (isCar = true)
         System.out.println("This is not suposed to hapen");

        isCar = false;
        if (isCar == true)
        System.out.println("Variable isCar is true - don't print this");

        isCar = true;
        if(isCar)
         System.out.println("isCar is true");

        boolean wasCar = isCar ? true : false;
        if(wasCar)
        System.out.println("wasCar is also true");

        isCar = !wasCar;
        System.out.println("Variable isCar is already: " + isAlien);

        double myDoubleValue = 20;
        double mySecondDoubleValue = 80;
        double myDoubleResult = 25 * (myDoubleValue + mySecondDoubleValue);
        System.out.println("My double result is: " + myDoubleResult);

        double myDoubleRemainder = (myDoubleResult) % 40;
        System.out.println("Divided by 40, the result will be: " + myDoubleRemainder);

        if (myDoubleRemainder <= 20)
        System.out.println("Total was over the limit");

        final int c;
        c=(30+5);
        //c=35;

        System.out.println(c);


     double b = Math.sqrt(c);
     System.out.println("Radical din c este: " + b);



    }
}