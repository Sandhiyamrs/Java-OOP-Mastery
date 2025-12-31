package com.example.oop.exceptions;

public class ExceptionFlowDemo {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Wrapped exception", e);
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
