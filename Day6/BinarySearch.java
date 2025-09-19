package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 61, 24, 13, 64, 35, 33 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        sc.close();

        int low = 0;
        int position = -1;
        int high = arr.length - 1;

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high--;
            } else if (arr[mid] < target) {
                low++;
            } else {
                position = mid + 1;
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