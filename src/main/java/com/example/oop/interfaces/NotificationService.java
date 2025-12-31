package com.example.oop.interfaces;

public interface NotificationService {

    void notifyUser(String msg);

    default void log(String msg) {
        System.out.println("Log: " + msg);
    }

    static void systemInfo() {
        System.out.println("Notification system v1.0");
    }
}
