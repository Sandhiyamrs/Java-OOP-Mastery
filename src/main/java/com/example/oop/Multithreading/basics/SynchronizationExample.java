class Counter {
    private int count = 0;

    // Synchronized to prevent race conditions
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join(); // Waits for thread 1 to finish
        t2.join(); // Waits for thread 2 to finish

        System.out.println("Final count: " + counter.getCount());
    }
}
