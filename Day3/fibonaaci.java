package Day3;

class forFibonaaci {
    static int n1 = 0;
    static int n2 = 1;

    public static void fibSeries(int range) {
        int sum;
        if (range == 1) {
            System.out.println(n1);
            return;
        }
        if (range == 2) {
            System.out.println(n1);
            System.out.println(n2);
            return;
        }

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 3; i <= range; i++) {
            sum = n1 + n2;
            System.out.println(sum + " ");
            n1 = n2;
            n2 = sum;
        }
    }
}

public class fibonaaci {
    public static void main(String[] args) {
        forFibonaaci.fibSeries(5);
    }
}
