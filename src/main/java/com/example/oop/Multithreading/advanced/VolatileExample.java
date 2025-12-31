package com.example.oop.Multithreading.advanced;

public class VolatileExample {

    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            while (running) {
            }
            System.out.println("Stopped");
        });

        worker.start();
        Thread.sleep(1000);
        running = false;
    }
}
