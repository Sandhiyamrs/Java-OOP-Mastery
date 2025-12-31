package com.example.oop.solidprinciples;

public class NotificationManager {

    private Notification notification;

    public NotificationManager(Notification notification) {
        this.notification = notification;
    }

    public void alert(String msg) {
        notification.send(msg);
    }
}
