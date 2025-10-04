package Generics;
import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // 1. add() - Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate will be ignored

        System.out.println("HashSet after adding elements: " + fruits);

        // 2. contains() - Check if an element exists
        System.out.println("Does set contain 'Mango'? " + fruits.contains("Mango"));
        System.out.println("Does set contain 'Grapes'? " + fruits.contains("Grapes"));

        // 3. remove() - Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // 4. size() - Get number of elements
        System.out.println("Size of HashSet: " + fruits.size());

        // 5. Iterating through HashSet
        System.out.println("Iterating through HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 6. clear() - Remove all elements
        fruits.clear();
        System.out.println("After clearing, HashSet: " + fruits);
    }
}
