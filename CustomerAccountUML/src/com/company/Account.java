package com.company;

public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account (int id, Customer customer){
        this(id,customer,0.0);
    }

    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString(){
        return (
                customer.toString() + " balance=$" +
                getBalance()
                );
    }

    public String getCustomerName(){
        return this.customer.getName();
    }
    public double deposit (double amount){
        setBalance(getBalance() + amount);
        return getBalance();
    }
    public double withdraw (double amount){

                if (amount <= getBalance()){
                    setBalance((getBalance() - amount));
                    return getBalance();
                } else {
                    System.out.println("Amount withdraw exceeds the current balance!");
                }
    return -1;
    }

}
