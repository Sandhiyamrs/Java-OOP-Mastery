package com.example.oop.miniprojects.bankingsystem;

public class BankingApp {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(500);
        account.withdraw(300);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
