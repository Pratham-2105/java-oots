package Day5;

public class garbageCollectionDemo {
    private String name;

    // Constructor
    garbageCollectionDemo(String name) {
        this.name = name;
    }

    // finalize() method (called before object is collected)
    @Override
    protected void finalize() {
        System.out.println("Garbage collector called for: " + name);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        garbageCollectionDemo o1 = new garbageCollectionDemo("random1");
        garbageCollectionDemo o2 = new garbageCollectionDemo("random2");

        o1 = null;
        o2 = null;

        System.out.println("Calling System.gc()");
        System.gc();
        for (int i = 0; i < 10000000; i++) {

        }

        System.out.println("End of main method!");
    }
}