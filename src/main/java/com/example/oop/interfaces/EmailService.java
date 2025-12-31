package com.example.oop.interfaces;

public class EmailService implements NotificationService {

    @Override
    public void notifyUser(String msg) {
        System.out.println("Email notification: " + msg);
    }
}
