package com.example.oop.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws Exception {

        User user = new User("Sandy");

        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("user.ser"));
        out.writeObject(user);
        out.close();

        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("user.ser"));
        User savedUser = (User) in.readObject();
        in.close();

        System.out.println("Deserialized User: " + savedUser.getUsername());
    }
}
