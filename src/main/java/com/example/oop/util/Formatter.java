package com.example.oop.util;

public class Formatter {
    public static String money(double amt){
        return String.format("$%.2f", amt);
    }
}
