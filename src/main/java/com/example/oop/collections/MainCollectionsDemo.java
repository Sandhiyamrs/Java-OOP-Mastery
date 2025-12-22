package com.example.oop.collections;

import java.util.ArrayList;
import java.util.List;

public class MainCollectionsDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Sandy", 90));
        students.add(new Student("Alex", 85));

        for (Student s : students) {
            System.out.println(s.getName() + " -> " + s.getMarks());
        }
    }
}
