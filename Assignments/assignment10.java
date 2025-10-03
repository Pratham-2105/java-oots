package Assignments;

class SharedResource {
    // Method with synchronized keyword (synchronized statement)
    public synchronized void synchronizedMethod(String threadName) {
        System.out.println(threadName + " entered synchronized method.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(threadName + " exiting synchronized method.");
    }

    // Method using synchronized block
    public void synchronizedBlock(String threadName) {
        System.out.println(threadName + " trying to enter synchronized block...");
        synchronized (this) {
            System.out.println(threadName + " entered synchronized block.");
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Block Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(threadName + " exiting synchronized block.");
        }
    }
}

class MyThread extends Thread {
    SharedResource resource;
    String mode; // "method" or "block"

    MyThread(SharedResource resource, String name, String mode) {
        super(name);
        this.resource = resource;
        this.mode = mode;
    }

    public void run() {
        if (mode.equals("method")) {
            resource.synchronizedMethod(getName());
        } else {
            resource.synchronizedBlock(getName());
        }
    }
}

public class assignment10 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Two threads calling synchronized method
        MyThread t1 = new MyThread(resource, "Thread-1", "method");
        MyThread t2 = new MyThread(resource, "Thread-2", "method");

        // Two threads calling synchronized block
        MyThread t3 = new MyThread(resource, "Thread-3", "block");
        MyThread t4 = new MyThread(resource, "Thread-4", "block");

        System.out.println("---- Running synchronized method example ----");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---- Running synchronized block example ----");
        t3.start();
        t4.start();
    }
}