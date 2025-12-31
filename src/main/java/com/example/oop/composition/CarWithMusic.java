package com.example.oop.composition;

public class CarWithMusic {
    private Engine engine = new Engine();
    private MusicSystem musicSystem = new MusicSystem();

    public void drive() {
        engine.start();
        musicSystem.play();
    }
}
