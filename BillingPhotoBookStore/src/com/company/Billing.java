package com.company;

public class Billing {

    public static void main(String[] args) {

        System.out.println(computeBill(9));
        System.out.println(computeBill(8,3));
        System.out.println(computeBill(6, 6, 7));
    }


    public static double computeBill(double price){
        return (price * 1.08 );
    }

    public static double computeBill(double price, double quantity){
        return ((price * quantity) * 1.08 );
    }

    public static double computeBill(double price, double quantity, double coupon){
        return (((price * quantity) - coupon )* 1.08 );
    }



}
