package com.example.oop.Multithreading.advanced;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private static int count = 0;
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            lock.lock();
            try {
                count++;
                System.out.println(Thread.currentThread().getName() + " count=" + count);
            } finally {
                lock.unlock();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start(); t2.start();
        t1.join(); t2.join();
    }
}
