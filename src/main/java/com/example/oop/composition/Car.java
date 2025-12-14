package com.example.oop.composition;

public class Car {
    private final String model;
    private final Engine engine;
    
// Composition: Car has an Engine

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Starting car: " + model);
        engine.start();
    }
}
