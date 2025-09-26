package Day7;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        int result = 0;

        int[] arr1 = { 1, 2, 3, 4, 5 };

        try {
            System.out.println(arr1[5]);
            result = a / b;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is out of bounds: " + e);
        } catch (Exception e) {
            System.out.println("General Exception Caught: " + e);
        }

        System.out.println("The program in continued after exceptions");
    }
}
