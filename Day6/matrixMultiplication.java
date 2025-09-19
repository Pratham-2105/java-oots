package Day6;

public class matrixMultiplication {

    public static void matrixMul(int[][] arr1, int[][] arr2) {
        int rowOfArr1 = arr1.length;
        int colOfArr1 = arr1[0].length;

        int rowOfArr2 = arr2.length;
        int colOfArr2 = arr2[0].length;

        if (rowOfArr2 != colOfArr1) {
            System.out.println("Multiplication not possible.");
            return;
        }

        int[][] result = new int[rowOfArr1][colOfArr2];

        for (int i = 0; i < rowOfArr1; i++) {
            for (int j = 0; j < colOfArr2; j++) { // rowOfArr1 == colOfArr2 for *; 
                int sum = 0;
                for (int k = 0; k < colOfArr1; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                result[i][j] = sum;
            }
        }

        for (int i[] : result) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };

        int[][] arr2 = {
                { 1, 2, 3 },
                { 8, 9, 0 },
                { 4, 5, 7 }
        };

        matrixMul(arr1, arr2);
    }
}