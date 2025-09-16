package Loops;

public class forLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int[] arr = { 4, 7, 8, 4, 1 };

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        char[] str = { 'H', 'e', 'l', 'l', 'o' };
        for (char s : str) {
            System.out.print(s);
        }
    }
}