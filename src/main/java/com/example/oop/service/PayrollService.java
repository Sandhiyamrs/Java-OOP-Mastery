package com.example.oop.service;

import com.example.oop.model.Employee;
import java.util.List;

public class PayrollService {
    public double calculateTotalSalary(List<Employee> employees){
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }
}

