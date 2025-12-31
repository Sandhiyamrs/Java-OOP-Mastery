package com.example.oop.collections;

import java.util.*;

public class StudentSorter {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Sandy", 90));
        students.add(new Student("Alex", 75));

        students.sort(Comparator.comparingInt(Student::getMarks).reversed());

        students.forEach(s ->
                System.out.println(s.getName() + " - " + s.getMarks()));
    }
}
