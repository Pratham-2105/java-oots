package Day6;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 20, 25, 30 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int key = sc.nextInt();
        sc.close();

        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                position = i + 1;
                break;
            }
        }

        if (position == -1) {
            System.out.println("The element does not exist in the array.");
        } else {
            System.out.println("The element exists at: " + position);
        }
    }
}
