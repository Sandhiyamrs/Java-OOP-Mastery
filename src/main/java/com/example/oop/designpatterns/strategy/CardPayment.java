package com.example.oop.designpatterns.strategy;

public class CardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via card");
    }
}
