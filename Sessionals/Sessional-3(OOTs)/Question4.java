public class Question4 {
    public static <T> void swap(T a, T b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
        System.out.println();
    }

    public static void main(String[] args) {
        swap(10, 20);
        swap("Java", "Python");
        swap(12.5, 45.7);

        System.out.println("Generic methods provide type safety and eliminate casting errors.");
    }
}
