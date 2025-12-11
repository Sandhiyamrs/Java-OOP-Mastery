package com.example.oop.finalkeyword;

public class MainFinalKeyword {

    public static void main(String[] args) {

        System.out.println("=== Final Variable Demo ===");
        FinalVariableDemo varDemo = new FinalVariableDemo();
        varDemo.showLimit();

        System.out.println("\n=== Final Method Demo ===");
        FinalMethodDemo methodDemo = new FinalMethodDemo();
        methodDemo.show();

        System.out.println("\n=== Final Class Demo ===");
        FinalClassDemo classDemo = new FinalClassDemo();
        classDemo.display();
    }
}
