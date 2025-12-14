import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Worker extends Thread {
    private final BlockingQueue<Runnable> taskQueue;

    public Worker(BlockingQueue<Runnable> queue) { 
        this.taskQueue = queue; 
    }

    @Override
    public void run() {
        while (true) {
            try {
                Runnable task = taskQueue.take();
                task.run();
            } catch (InterruptedException e) {
                break; // Exit thread if interrupted
            }
        }
    }
}

class CustomThreadPool {
    private final BlockingQueue<Runnable> taskQueue;
    private final Worker[] workers;

    public CustomThreadPool(int nThreads) {
        taskQueue = new LinkedBlockingQueue<>();
        workers = new Worker[nThreads];
        for (int i = 0; i < nThreads; i++) {
            workers[i] = new Worker(taskQueue); // Create worker
        }
    }

    // Safe: start threads after constructor
    public void startAllThreads() {
        for (Worker w : workers) {
            w.start();
        }
    }

    public void submit(Runnable task) throws InterruptedException {
        taskQueue.put(task);
    }
}

public class CustomThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        CustomThreadPool pool = new CustomThreadPool(3);
        pool.startAllThreads(); // Start threads safely after construction

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            pool.submit(() -> 
                System.out.println("Executing task " + taskId + " by " + Thread.currentThread().getName())
            );
        }
    }
}
