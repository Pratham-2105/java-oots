public class Sample extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread at work");
        } else {
            System.out.println("user thread at work");
        }
    }

    public static void main(String[] args) {
        Sample t1 = new Sample();
        Sample t2 = new Sample();
        Sample t3 = new Sample();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
