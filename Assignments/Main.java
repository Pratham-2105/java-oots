package Assignments;

import java.util.*;
import java.util.function.*;

public class Main {
    public static class Person {
        String name;
        int age;

        Person(String n, int a) {
            name = n;
            age = a;
        }

        public String toString() {
            return name + "-" + age;
        }
    }

    public static void main(String[] args) {
        // Lambda expression with multiple parameters
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println("Lambda multi-param multiply 6*7=" + multiply.apply(6, 7));

        // Lambda expression to iterate list of objects
        List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35));
        System.out.println("Iterate list of objects:");
        people.forEach(p -> System.out.println(p));

        // Insertion Sort
        int[] arr1 = { 9, 5, 1, 4, 3, 7, 6, 2, 8 };
        System.out.println("Insertion Sort:");
        insertionSort(arr1);
        printArray(arr1);

        // Selection Sort (largest element method)
        int[] arr2 = { 29, 10, 14, 37, 13, 5, 2, 20 };
        System.out.println("Selection Sort (largest element method):");
        selectionSortLargest(arr2);
        printArray(arr2);

        // Bubble Sort
        int[] arr3 = { 5, 1, 4, 2, 8, 0, 2 };
        System.out.println("Bubble Sort:");
        bubbleSort(arr3);
        printArray(arr3);
    }

    // Insertion Sort method
    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    // Selection Sort (largest element method)
    static void selectionSortLargest(int[] a) {
        for (int end = a.length - 1; end > 0; end--) {
            int maxIdx = 0;
            for (int i = 1; i <= end; i++) {
                if (a[i] > a[maxIdx])
                    maxIdx = i;
            }
            int tmp = a[maxIdx];
            a[maxIdx] = a[end];
            a[end] = tmp;
        }
    }

    // Bubble Sort method
    static void bubbleSort(int[] a) {
        boolean swapped;
        for (int i = 0; i < a.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    // Print array elements
    static void printArray(int[] a) {
        for (int v : a)
            System.out.print(v + " ");
        System.out.println();
    }
}
