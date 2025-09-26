package Day7;

public class ThrowDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("Trying to divide by zero...");
            int result = example1();
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed.");
        }
    }

    public static int example1() throws ArithmeticException {
        int a = 5;
        int b = 0;
        int result = a / b;
        System.out.println(result);

        return result;
    }

    public static int example2(int x) {
        if (x == 0) {
            throw new ArithmeticException("Division by zero not allowed.");
        }
        return 1 / x;
    }
}