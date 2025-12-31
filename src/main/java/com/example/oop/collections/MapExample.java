package com.example.oop.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee(1, "Sandy"), "Developer");
        map.put(new Employee(1, "Sandy"), "Lead");

        System.out.println(map.size()); // proves equals/hashCode
    }
}
