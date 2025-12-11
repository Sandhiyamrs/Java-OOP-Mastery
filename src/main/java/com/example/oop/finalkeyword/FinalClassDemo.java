package com.example.oop.finalkeyword;

// final class → cannot be inherited
final class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class FinalClassDemo {

    public void display() {
        Calculator cal = new Calculator();
        System.out.println("Addition: " + cal.add(10, 20));
    }

    // ❌ Cannot extend Calculator because it is final
    // class AdvancedCalculator extends Calculator {}  // ERROR
}

