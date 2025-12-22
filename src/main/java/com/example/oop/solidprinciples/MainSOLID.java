package com.example.oop.solidprinciples;

public class MainSOLID {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.send("Welcome to JAVA OOP MASTERY");
    }
}
