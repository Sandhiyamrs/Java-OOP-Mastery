import java.util.LinkedList;
import java.util.Queue;

class PC {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while(true) {
            synchronized(this) {
                while(queue.size() == capacity) wait();
                queue.add(value);
                System.out.println("Produced: " + value++);
                notify();
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException {
        while(true) {
            synchronized(this) {
                while(queue.isEmpty()) wait();
                int val = queue.remove();
                System.out.println("Consumed: " + val);
                notify();
                Thread.sleep(500);
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        PC pc = new PC();

        Thread producer = new Thread(() -> {
            try { pc.produce(); } catch (InterruptedException e) { e.printStackTrace(); }
        });

        Thread consumer = new Thread(() -> {
            try { pc.consume(); } catch (InterruptedException e) { e.printStackTrace(); }
        });

        producer.start();
        consumer.start();
    }
}
