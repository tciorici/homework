package com.company;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer(100,"Jack",'m');
        Account jacksAccount = new Account(12,customer1);

        System.out.println(jacksAccount.toString());

        jacksAccount.deposit(110);
        System.out.println(jacksAccount.toString());

        jacksAccount.withdraw(90);
        System.out.println(jacksAccount.toString());

        jacksAccount.withdraw(30);

        jacksAccount.withdraw(20);
        System.out.println(jacksAccount.toString());

        jacksAccount.withdraw(2);
        System.out.println(jacksAccount.toString());






    }
}
