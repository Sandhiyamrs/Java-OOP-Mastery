package com.example.oop.exceptions;

public class BankAccount {
    private double balance = 1000;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn ₹" + amount);
    }
}
