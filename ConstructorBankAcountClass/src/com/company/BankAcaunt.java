package com.company;

public class BankAcaunt{

    private int acauntNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;


        public void depositMoney (double amount){
            if (amount > 0){
                this.balance += amount;
            }else {
                System.out.println("Invalid Value");
            }
        }

        public void withdrowMoney (double amount){

            if (amount <= balance){
            this.balance -= amount;
            }else {
                System.out.println("Not enough money!");
            }

        }

        public int getAcauntNumber() {
            return acauntNumber;
        }

        public void setAcauntNumber(int acountNumber) {
            this.acauntNumber = acountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
}
