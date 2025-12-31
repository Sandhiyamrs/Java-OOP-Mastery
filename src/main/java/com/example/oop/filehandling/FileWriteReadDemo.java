package com.example.oop.filehandling;

import java.io.*;

public class FileWriteReadDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");

        FileWriter writer = new FileWriter(file);
        writer.write("JAVA OOP MASTERY\nFile Handling Example");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
