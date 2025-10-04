package Generics;
                                   
public class Gmethod {

    // Generic method that prints any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Generic method that returns the first element of an array
    public static <T> T getFirstElement(T[] array) {
        return array[0];
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        System.out.print("Integer Array: ");
        printArray(intArray);
        System.out.println("First Integer Element: " + getFirstElement(intArray));

        // String array
        String[] strArray = { "Hello", "Generics", "World" };
        System.out.print("String Array: ");
        printArray(strArray);
        System.out.println("First String Element: " + getFirstElement(strArray));

        // Double array
        Double[] dblArray = { 10.5, 20.7, 30.2 };
        System.out.print("Double Array: ");
        printArray(dblArray);
        System.out.println("First Double Element: " + getFirstElement(dblArray));
    }
}
