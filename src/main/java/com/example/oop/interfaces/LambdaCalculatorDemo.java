package com.example.oop.interfaces;

public class LambdaCalculatorDemo {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator mul = (a, b) -> a * b;

        System.out.println(add.calculate(2, 3));
        System.out.println(mul.calculate(2, 3));
    }
}
