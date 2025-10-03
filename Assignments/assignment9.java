package Assignments;

import java.util.concurrent.locks.ReentrantLock;

class SharedData {
    private int counter = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment(String threadName) {
        lock.lock(); // Acquire the lock
        try {
            counter++;
            System.out.println(threadName + " incremented counter to: " +
                    counter);
            Thread.sleep(400); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // Always release the lock
        }
    }
}

class Worker extends Thread {
    private final SharedData data;

    Worker(SharedData data, String name) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            data.increment(getName());
        }
    }
}

public class assignment9 {
    public static void main(String[] args) {
        SharedData shared = new SharedData();

        Worker t1 = new Worker(shared, "Thread-1");
        Worker t2 = new Worker(shared, "Thread-2");

        t1.start();
        t2.start();
    }
}