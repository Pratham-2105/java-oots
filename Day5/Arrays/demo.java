package Day5.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        String[] countries = { "India", "China", "Nepal", "USA", "Qatar" };
        for (String name : countries) {
            System.out.print(name + " ");
        }
    }
}