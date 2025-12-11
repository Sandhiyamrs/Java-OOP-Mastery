package com.example.oop.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {

        // Example 1: Student Encapsulation
        Student s = new Student();
        s.setName("Sandy");
        s.setAge(20);
        s.setDepartment("Computer Science");

        System.out.println("Student Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Department: " + s.getDepartment());


        // Example 2: Bank Account Encapsulation
        BankAccount account = new BankAccount("Sandy", 5000);

        account.deposit(1500);
        account.withdraw(2000);

        System.out.println("Final Balance: " + account.getBalance());
    }
}

