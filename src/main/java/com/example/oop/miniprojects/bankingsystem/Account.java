package com.example.oop.miniprojects.bankingsystem;

public class Account {
    private double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
