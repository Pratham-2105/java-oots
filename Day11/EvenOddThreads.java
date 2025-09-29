package Day11;

// class EvenThread extends Threads {}
class EvenThread implements Runnable {
    private int limit;

    public EvenThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// class OddThread extends Thread {}
class OddThread implements Runnable {
    private int limit;

    public OddThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        int limit = 20;

        EvenThread even = new EvenThread(limit);
        OddThread odd = new OddThread(limit);

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);

        even.run();
        odd.run();

        System.out.println();
        
        t1.start();
        t2.start();
    }
}
