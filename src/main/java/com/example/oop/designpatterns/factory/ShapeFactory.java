package com.example.oop.designpatterns.factory;

public class ShapeFactory {

    public static Shape getShape(String type) {
        if (type == null) return null;

        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

