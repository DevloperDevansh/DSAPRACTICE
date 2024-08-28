package RecursionQuestion.sorting;

public class Bubblesort {

    public static void main(String[] args) {
        // take array for sorting
        int arr[] = { 40, 30, 20, 10 };

        // start the loop for sorting
        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (issmaller(arr, j + 1, j) == true) {
                    swap(arr, j + 1, j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // swap logic
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // check is smaller function
    private static boolean issmaller(int[] arr, int i, int j) {
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }

}
