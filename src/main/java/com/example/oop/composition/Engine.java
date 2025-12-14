package com.example.oop.composition;

public class Engine {
    private final String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine (" + type + ") started.");
    }
}
