package Loops;

import java.util.Scanner;

class forFactorial {

    long sum = 1;

    public void calculateFactorial(long num) {
        if (num == 1)
            System.out.println(1);
        for (long i = 2; i <= num; i++) {
            sum *= i;
        }
        System.out.println("Factorial of " + num + ": " + sum);
    }
}

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        sc.close();

        forFactorial fact = new forFactorial();
        fact.calculateFactorial(num);
    }
}