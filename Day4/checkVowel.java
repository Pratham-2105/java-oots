import java.util.Scanner;

public class checkVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char in = sc.next().charAt(0);
        sc.close();
        
        in = Character.toLowerCase(in);

        switch (in) {
            case 'a':
                System.out.println(in + " is a vowel.");
                break;

            case 'e':
                System.out.println(in + " is a vowel.");
                break;

            case 'i':
                System.out.println(in + " is a vowel.");
                break;

            case 'o':
                System.out.println(in + " is a vowel.");
                break;

            case 'u':
                System.out.println(in + " is a vowel.");
                break;

            default:
                System.out.println(in + " is not a vowel");
        }
    }
}