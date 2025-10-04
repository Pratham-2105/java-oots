package Generics;

import java.util.*;

public class Wildclass {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // 1. add() - Adding elements to ArrayList
        names.add("Neetu");
        names.add("Raj");
        names.add("Priya");
        names.add("Aman");

        System.out.println("ArrayList after adding elements: " + names);

        // 2. get() - Retrieve elements using index
        System.out.println("Element at index 0: " + names.get(0));
        System.out.println("Element at index 2: " + names.get(2));

        // 3. set() - Modify element at a specific index
        names.set(1, "Ravi");
        System.out.println("After updating element at index 1: " + names);

        // 4. remove() - Remove elements
        names.remove("Priya"); // remove by value
        names.remove(0); // remove by index
        System.out.println("After removing elements: " + names);

        // 5. size() - Check number of elements
        System.out.println("Total elements in ArrayList: " + names.size());

        // 6. Iterate using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // 7. clear() - Remove all elements
        names.clear();
        System.out.println("After clearing all elements: " + names);
    }
}