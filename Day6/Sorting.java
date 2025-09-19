package Day6;

class Sorts {
    public void printArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void InsertionSort(int[] arr) {
        int n = arr.length;
        int[] temp = arr;

        for (int i = 1; i < n; i++) {
            int key = temp[i]; // store current value in temp
            int j = i - 1;

            // Shift elements that are greater than temp
            while (j >= 0 && temp[j] > key) {
                temp[j + 1] = temp[j];
                j--;
            }
            temp[j + 1] = key; // place temp in the right position
        }

        printArray(temp);
    }

    public void BubbleSort(int[] arr) {
        int n = arr.length;
        int[] temp = arr;

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    // use temp for swapping
                    int key = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = key;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        printArray(temp);
    }

    public void SelectionSort(int[] arr) {
        int n = arr.length;
        int[] temp = arr;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (temp[j] < temp[minIndex]) {
                    minIndex = j;
                }
            }

            // swap with temp
            int key = temp[minIndex];
            temp[minIndex] = temp[i];
            temp[i] = key;
        }

        printArray(temp);
    }
}

public class Sorting {
    public static void main(String[] args) {
        int[] arr1 = { 43, 13, 4, 55, 34, 11, 99, 76 };

        Sorts srt = new Sorts();
        srt.InsertionSort(arr1);
        srt.BubbleSort(arr1);
        srt.SelectionSort(arr1);
    }
}