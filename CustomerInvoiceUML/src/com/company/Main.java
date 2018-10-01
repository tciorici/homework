package com.company;

public class Main {

    public static void main(String[] args) {

        Customer customerIlie = new Customer(123,"Ilie",10);
        System.out.println("My customer name and ID is: " + customerIlie);

        Invoice invoiceForIlie = new Invoice(666,customerIlie,150);
        System.out.println("Amount after discount of " + customerIlie.getDiscount()+
                "% is: " + invoiceForIlie.getAmountAfterDiscount());

    }
}
