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

    // A method that declares it may throw an exception
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote"); // explicitly thrown
        } else {
            System.out.println("You can vote!");
        }
    }

    public static void main(String[] args) {
        ExceptionDemo();
        System.out.println();

        try {
            checkAge(17); // calling the method that uses 'throws'
        } catch (ArithmeticException e) {
            System.out.println("Handled in main: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }

        System.out.println("Main program continues after handling 'throws'.");
    }
}