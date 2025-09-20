package Assignments;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class assignment4 {

    // 1. Method Overloading
    static class Calculator {
        // add two ints
        public int add(int a, int b) {
            return a + b;
        }

        // add three ints (overloaded)
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // add two doubles (overloaded)
        public double add(double a, double b) {
            return a + b;
        }
    }

    // 2. Method Overriding
    static class Animal {
        public void speak() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void speak() {
            System.out.println("Dog barks: Woof!");
        }
    }

    // 3 & 6. Lambda - as method parameter and multi-parameter lambda
    // Functional interface for single-int transformations (used to pass lambda as
    // param)
    @FunctionalInterface
    interface IntTransform {
        int apply(int x);
    }

    // Functional interface with two parameters (demonstrate multi-parameter lambda)
    @FunctionalInterface
    interface IntBiOperation {
        int apply(int a, int b);
    }

    // method that accepts a lambda as parameter and applies it to every element of
    // arr,
    // returns a new int[] with transformed values
    public static int[] processArrayWithLambda(int[] arr, IntTransform transform) {
        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = transform.apply(arr[i]);
        }
        return out;
    }

    // 4. CountOfTwoNumbers
    public static class CountOfTwoNumbers {
        // assumptions: arr is never null
        public boolean compareCountOf(int[] arr, int arg1, int arg2) {
            int c1 = 0, c2 = 0;
            for (int v : arr) {
                if (v == arg1)
                    c1++;
                if (v == arg2)
                    c2++;
            }
            return c1 > c2;
        }
    }

    // 5. Matrix multiplication
    // multiply m x n and n x p => returns m x p matrix; throws
    // IllegalArgumentException on invalid dims
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int n2 = b.length;
        int p = b[0].length;
        if (n != n2) {
            System.out.println("Matrix inner dimensions must match (a columns == b rows).");
            return a;
        }
        int[][] result = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    // utility: print matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    // 7. Lambda iterating list of objects
    static class Person {
        String name;
        int age;

        Person(String n, int a) {
            name = n;
            age = a;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 1) Method Overloading ===");
        Calculator calc = new Calculator();
        System.out.println("add(2,3) = " + calc.add(2, 3));
        System.out.println("add(1,2,3) = " + calc.add(1, 2, 3));
        System.out.println("add(1.5,2.25) = " + calc.add(1.5, 2.25));

        System.out.println("\n=== 2) Method Overriding ===");
        Animal a = new Animal();
        Animal d = new Dog(); // polymorphic reference
        a.speak(); // base
        d.speak(); // overridden in Dog

        System.out.println("\n=== 3) Lambda as Method Parameter (processArrayWithLambda) ===");
        int[] sample = { 1, 2, 3, 4, 5 };
        // lambda that squares each element
        int[] squared = processArrayWithLambda(sample, x -> x * x);
        System.out.println("Original: " + Arrays.toString(sample));
        System.out.println("Squared:  " + Arrays.toString(squared));

        System.out.println("\n=== 4) CountOfTwoNumbers.compareCountOf ===");
        CountOfTwoNumbers counter = new CountOfTwoNumbers();
        int[] arr = { 1, 2, 3, 2, 1, 2, 3, 2, 1, 1 };
        int arg1 = 1, arg2 = 2;
        boolean result = counter.compareCountOf(arr, arg1, arg2);
        System.out.printf("In %s: count(%d) > count(%d) ? %b%n", Arrays.toString(arr), arg1, arg2, result);

        // edge case: arg1 == arg2 -> compare should be false (count equal not greater)
        System.out.println("When args equal (2,2): " + counter.compareCountOf(arr, 2, 2));

        System.out.println("\n=== 5) Matrix Multiplication ===");
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        }; // 2x3
        int[][] B = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        }; // 3x2
        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);
        int[][] C = multiplyMatrices(A, B); // should be 2x2
        System.out.println("A x B = ");
        printMatrix(C);

        System.out.println("\n=== 6) Lambda with multiple parameters ===");
        // using custom IntBiOperation
        IntBiOperation multiply = (x, y) -> x * y;
        IntBiOperation add = (x, y) -> x + y;
        System.out.println("multiply.apply(6,7) = " + multiply.apply(6, 7));
        System.out.println("add.apply(6,7) = " + add.apply(6, 7));

        // Also show using standard BiFunction
        BiFunction<Integer, Integer, Integer> powerSum = (x, y) -> (int) (Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("powerSum.apply(3,4) = " + powerSum.apply(3, 4));

        System.out.println("\n=== 7) Lambda iterating list of objects ===");
        List<Person> people = Arrays.asList(
                new Person("Alice", 23),
                new Person("Bob", 30),
                new Person("Charlie", 19));
        System.out.println("Printing persons with forEach and lambda:");
        people.forEach(p -> System.out.println(" - " + p));

        // Using lambda to filter and collect names of adults (>=21)
        List<String> adultNames = people.stream()
                .filter(p -> p.age >= 21)
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println("Adults: " + adultNames);

        System.out.println("\n=== Extra demonstration: passing standard Java functional interface ===");
        // Using java.util.function.IntUnaryOperator as an alternative
        IntUnaryOperator incByFive = x -> x + 5;
        int[] incResult = processArrayWithLambda(sample, x -> incByFive.applyAsInt(x)); // wrapping
        System.out.println("Incremented by 5: " + Arrays.toString(incResult));

        System.out.println("\n=== Done ===");
    }
}