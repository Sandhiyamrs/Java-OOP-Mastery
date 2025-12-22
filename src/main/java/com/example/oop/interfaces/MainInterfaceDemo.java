package com.example.oop.interfaces;

public class MainInterfaceDemo {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UpiPayment();

        payment1.pay(500);
        payment2.pay(250);
    }
}
