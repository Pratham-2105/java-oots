import java.util.Scanner;

class NegativeNumberNotAllowedException extends Exception {
}

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        System.out.print("Enter the size of the array: ");
        n = scanner.nextInt();

        int[] numbers = new int[n];
        int index = 0;

        while (index < numbers.length) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();

            try {
                int num = input;
                if (num < 0) {
                    throw new NegativeNumberNotAllowedException();
                }
                numbers[index] = num;
                index++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid number.");
            } catch (NegativeNumberNotAllowedException e) {
                System.out.println("Negative numbers are not allowed.");
            }
        }
        scanner.close();

        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}