package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,1988));
        System.out.println(getDaysInMonth(2,2005));
        System.out.println(getDaysInMonth(2,2004));
        System.out.println(getDaysInMonth(2,1200));

    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {return true;
                    }else {return false;}
                }else{return true;}
            }else {return false;}
        } return false;
    }


    public static int getDaysInMonth (int month, int year) {

        if (month > 12 || month < 1 || year > 9999 || year < 1) {
            return -1;
        } else {
            switch (month) {

                case 1:
                    return 31;

                case 2:
                    if (isLeapYear(year) == true) {
                        return 29;
                    } else {
                        return 28;
                    }

                case 3:
                    return 31;

                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

                default:
                    return -1;
            }
        }
    }
}


