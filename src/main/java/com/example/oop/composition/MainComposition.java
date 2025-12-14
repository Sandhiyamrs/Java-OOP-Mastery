package com.example.oop.composition;

public class MainComposition {
    public static void main(String[] args) {
        Engine v8 = new Engine("V8");
        Car mustang = new Car("Mustang", v8);
        mustang.startCar();
    }
}

