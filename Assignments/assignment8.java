package Assignments;

import java.util.Scanner;

public class assignment8 {
    // Program 58 & 59 in one file

    // Program 58: Merge two strings character by character
    public static String mergeStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            result.append(a.charAt(i++));
            result.append(b.charAt(j++));
        }
        // Add leftover characters
        while (i < a.length()) {
            result.append(a.charAt(i++));
        }
        while (j < b.length()) {
            result.append(b.charAt(j++));
        }
        return result.toString();
    }

    // Program 59: Concatenate two strings using StringBuilder
    public static String concatStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Program 58 output
        String merged = mergeStrings(str1, str2);
        System.out.println("Merged string (char by char): " + merged);

        // Program 59 output
        String concatenated = concatStrings(str1, str2);
        System.out.println("Concatenated string: " + concatenated);

        sc.close();
    }
}
