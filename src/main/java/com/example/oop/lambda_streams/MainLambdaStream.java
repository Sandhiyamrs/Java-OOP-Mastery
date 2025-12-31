package com.example.oop.lambda_streams;

import java.util.*;
import java.util.stream.Collectors;

public class MainLambdaStream {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Sandy", 70000),
                new Employee("Alex", 50000),
                new Employee("John", 90000)
        );

        List<String> highEarners = list.stream()
                .filter(e -> e.getSalary() > 60000)
                .map(Employee::getName)
                .collect(Collectors.toList());

        highEarners.forEach(System.out::println);
    }
}
