// package Day4;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 40;
        sc.close();

        switch (number) {
            case 10 -> System.out.println("10");
            case 20 -> System.out.println("20");
            case 30 -> System.out.println("30");
            case 40 -> System.out.println(number % 2 == 0 ? "True" : "False");
            default -> System.out.println("Invalid");
        }

        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}