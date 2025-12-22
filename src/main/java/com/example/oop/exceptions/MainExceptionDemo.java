package com.example.oop.exceptions;

public class MainExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
