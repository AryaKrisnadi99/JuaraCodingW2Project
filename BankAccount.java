package com.juaracoding;

public class BankAccount {
    int acc_no;
    String name;
    double amount;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println("You deposited "+amt+" to your bank account");
        return amount;
    }

    public double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println("You withdrawn "+amt+" from your bank account");
        }
        return amount;
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + amount);
    }

    public void display() {
        System.out.println("Your acc number is "+ acc_no);
        System.out.println("Your name is "+ name);
        System.out.println("Your current amount is "+amount);
    }
}
