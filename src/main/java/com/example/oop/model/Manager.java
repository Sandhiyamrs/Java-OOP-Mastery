package com.example.oop.model;

import java.util.List;

public class Manager extends Employee {
    private List<Employee> team;

    public Manager(String name, int age, double salary, List<Employee> team){
        super(name, age, salary);
        this.team = team;
    }

    public void addMember(Employee e){ team.add(e); }
    public List<Employee> getTeam(){ return team; }

    public void printTeam(){
        System.out.println("Manager " + getName() + " manages:");
        team.forEach(e -> System.out.println(" - " + e.getName()));
    }
}
