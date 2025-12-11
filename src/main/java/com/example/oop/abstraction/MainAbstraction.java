package com.example.oop.abstraction;

public class MainAbstraction {
    public static void main(String[] args) {

        Shape s = new Circle(5.0);
        s.display();
        System.out.println("Area = " + s.area());
    }
}

