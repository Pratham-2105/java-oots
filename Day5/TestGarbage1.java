package Day5;

public class TestGarbage1 {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        TestGarbage1 s1 = new TestGarbage1();
        TestGarbage1 s2 = new TestGarbage1();

        System.out.println(s1);
        System.out.println(s2);

        s2 = null;

        System.out.println(s2);
        System.gc();
    }
}