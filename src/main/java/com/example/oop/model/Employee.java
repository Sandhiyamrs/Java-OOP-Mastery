package com.example.oop.model;

public class Employee extends Person {
    private double salary;

    public Employee() {}
    public Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public double getSalary(){ return salary; }
    public void setSalary(double s){ this.salary = s; }

    @Override
    public void speak(){
        System.out.println("Hello, I'm " + getName() + " and I earn $" + salary);
    }
}

