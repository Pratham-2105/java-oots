package Day5.Polymorphism;

public class testOverloading3 {
    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args){
        testOverloading3 test = new testOverloading3();
        test.sum(12, 43);
        test.sum(12, 22);
    }
}