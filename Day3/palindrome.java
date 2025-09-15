package Day3;

import java.util.Scanner;

class forPalindrome {
    boolean result = false;

    public void checkPalindrome(int number) {
        int temp = number;
        int rev = 0;

        while (temp != 0) {
            int last = temp % 10; // last digit of the number.
            rev = (rev * 10) + last; // add the last digit to the rev;
            temp /= 10; // remove the last digit;
        }

        if (rev != number) {
            System.out.println("Number is not palindrome");
            return;
        }
        System.out.println("Number is palindrome");

    }
}
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test > 0) {
            System.out.print("Enter the number: ");
            int temp = sc.nextInt();

            forPalindrome pdr = new forPalindrome();
            pdr.checkPalindrome(temp);

            test--;
        }
        sc.close();
    }
}