package Loops;

public class breakLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }

        aa: for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 && i == j) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
            System.out.println();
        }
    }
}
