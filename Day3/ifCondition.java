package Day3;

import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Age: ");
        // int age = sc.nextInt();
        int age = 19;
        // System.out.print("Enter weight: ");
        // int weight = sc.nextInt();
        int weight = 51;
        sc.close();

        if (age > 18)
            System.out.println("Age is greater than 18.");
        else
            System.out.println("Age is less than or equal to 18.");

        if (age > 18) {
            if (weight > 50) {
                System.out.println("Can Donate Blood!");
            } else {
                System.out.println("Age is over 18 but weight is less than 50");
            }
        }

        int num0 = 13;

        if (num0 % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        int num1 = -12;

        if (num1 > 0)
            System.out.println("Positive Number");
        else if (num1 < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Number is zero");
    }
}
