package com.example.oop;

import com.example.oop.model.*;
import com.example.oop.service.PayrollService;
import com.example.oop.util.Formatter;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args){
        Employee e1 = new Employee("Alice", 28, 60000);
        Employee e2 = new Employee("Bob", 32, 70000);
        List<Employee> team = new ArrayList<>();
        team.add(e1);
        Manager m = new Manager("Carol", 40, 120000, team);
        m.addMember(e2);

        m.speak();
        m.printTeam();

        PayrollService payroll = new PayrollService();
        double total = payroll.calculateTotalSalary(List.of(e1, e2, m));
        System.out.println("Total payroll: " + total);
    }
}

