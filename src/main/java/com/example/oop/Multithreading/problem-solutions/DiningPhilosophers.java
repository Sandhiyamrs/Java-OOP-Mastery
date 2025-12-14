import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Chopstick {
    private final Lock lock = new ReentrantLock();
    public void pick() { lock.lock(); }
    public void put() { lock.unlock(); }
}

class Philosopher extends Thread {
    private Chopstick left, right;

    public Philosopher(Chopstick left, Chopstick right, String name) {
        super(name);
        this.left = left;
        this.right = right;
    }

    public void run() {
        while(true) {
            try {
                left.pick();
                right.pick();
                System.out.println(getName() + " is eating");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                left.put();
                right.put();
            }
        }
    }
}

public class DiningPhilosophers {
    public static void main(String[] args) {
        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();
        Chopstick c3 = new Chopstick();
        Chopstick c4 = new Chopstick();
        Chopstick c5 = new Chopstick();

        Philosopher p1 = new Philosopher(c1, c2, "Philosopher-1");
        Philosopher p2 = new Philosopher(c2, c3, "Philosopher-2");
        Philosopher p3 = new Philosopher(c3, c4, "Philosopher-3");
        Philosopher p4 = new Philosopher(c4, c5, "Philosopher-4");
        Philosopher p5 = new Philosopher(c5, c1, "Philosopher-5");

        p1.start(); p2.start(); p3.start(); p4.start(); p5.start();
    }
}
