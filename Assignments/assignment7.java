package Assignments;

import java.util.Scanner;

public class assignment7 {

    // Method to count total number of characters
    public static int countCharacters(String str) {
        return str.length();
    }

    // Method to count punctuation characters
    public static int countPunctuation(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int totalChars = countCharacters(input);
        int punctuationChars = countPunctuation(input);

        System.out.println("Total number of characters: " + totalChars);
        System.out.println("Total number of punctuation characters: " + punctuationChars);

        sc.close();
    }
}
