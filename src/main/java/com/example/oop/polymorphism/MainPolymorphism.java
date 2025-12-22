package com.example.oop.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Cow();

        a1.sound();
        a2.sound();
    }
}
