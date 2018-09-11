package com.company;

public class Main {

    public static void main(String[] args) {

        BankAcaunt t = new BankAcaunt();

        t.setBalance(100);
        System.out.println("Current amount in account is " + t.getBalance());

        t.depositMoney(200.6);
        System.out.println("Current amount in account is " + t.getBalance());

        t.withdrowMoney(280.5);
        System.out.println("Current amount in account is " + t.getBalance());

        t.withdrowMoney(400);



    }
}
