package com.example.oop.finalkeyword;

class Car {
    public final void startEngine() {
        System.out.println("Car engine starts!");
    }
}

public class FinalMethodDemo extends Car {

    // ❌ Cannot override startEngine() because it is final
    // public void startEngine() {}  // This would cause an error

    public void show() {
        startEngine();
    }
}

