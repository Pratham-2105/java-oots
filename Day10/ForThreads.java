class Multi3 implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

class Something extends Thread {
    public void run() {
        System.out.println("Thread class is running...");
    }
}

class Example1 {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread: " + (i + 1));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Example2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread: " + (i + 1));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ForThreads {
    public static void main(String[] args) {
        Multi3 m1 = new Multi3();
        Something s1 = new Something();
        Example1 e1 = new Example1();
        Example2 e2 = new Example2();

        Thread t1 = new Thread(m1);

        // e1.run();
        e2.run();
        // s1.run();
        // t1.run();
    }
}