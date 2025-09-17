package Day5.Polymorphism;

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class demo {
    public static void main(String[] args) {
        System.out.println(Adder.add(45, 21));
        System.out.println(Adder.add(12, 23, 54));
    }
}
