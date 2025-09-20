package Day7;

public class ThrowDemo {
    public static void ExceptionDemo() {
        try {
            int result = 10 / 0; // risky code;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This will print regardless of the try-catch.");
        }
        System.out.println("The program continues");
    }

    public static void main(String[] args) {
        ExceptionDemo();
        System.out.println();
        int age = 17;
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("You can vote!");
    }
}