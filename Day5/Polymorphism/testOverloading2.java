package Day5.Polymorphism;

class Adder {
    static int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    static double add(double a, double b) {
        System.out.println(a + b);
        return a + b;
    }
}

public class testOverloading2 {
    public static void main(String[] args) {
        Adder.add(12, 14.5);
        Adder.add(11, 11);

    }
}
