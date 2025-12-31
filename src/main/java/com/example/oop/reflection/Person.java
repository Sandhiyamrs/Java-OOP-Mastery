package com.example.oop.reflection;

public class Person {
    private String name;

    public Person() {
        this.name = "Unknown";
    }

    public void greet() {
        System.out.println("Hello, " + name);
    }
}
