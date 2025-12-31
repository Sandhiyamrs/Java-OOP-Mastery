package com.example.oop.designpatterns.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        PaymentStrategy strategy = new CardPayment();
        strategy.pay(1000);
    }
}
