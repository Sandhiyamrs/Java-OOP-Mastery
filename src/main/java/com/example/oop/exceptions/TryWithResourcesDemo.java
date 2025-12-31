package com.example.oop.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourcesDemo {
    public static void main(String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            System.out.println(br.readLine());
        }
    }
}
