import java.util.Scanner;

public class checkVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char in = sc.next().charAt(0);
        sc.close();

        in = Character.toLowerCase(in);

        if (in >= 'a' && in <= 'z') {

            switch (in) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(in + " is a vowel.");
                    break;
                default:
                    System.out.println(in + " is not a vowel");
                    return;
            }

            switch (in) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println(in + " is a vowel");
                default -> System.out.println(in + " is not a vowel");
            }
        } else {
            System.out.println("Not a valid input"); 
        }
    }
}