package com.juaracoding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         BankAccount bankAccount = new BankAccount();
         bankAccount.setAcc_no(123456789);
         bankAccount.setName("Budi");
         bankAccount.setAmount(4000000);

         System.out.println(bankAccount.getAmount());
         bankAccount.deposit(1000000);
         bankAccount.checkBalance();
         System.out.println();
         bankAccount.withdraw(3000000);
         bankAccount.checkBalance();

         System.out.println();
         bankAccount.display();

    }
}