package com.example.oop.polymorphism;

public class SoundTest {
    public static void makeSound(Animal animal) {
        animal.sound();
    }

    public static void main(String[] args) {
        makeSound(new Cat());
        makeSound(new Cow());
    }
}
