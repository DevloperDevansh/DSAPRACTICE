package RecursionQuestion.sorting;

public class Quickselect {

    public static void main(String[] args) {
        // Create array
        int arr[] = { 8, 3, 1, 2, 4, 6 };

        int k = 4;

        // calling function
        System.out.println("kth smallest:-" + quickselectsort(arr, 0, arr.length - 1, k - 1));
    }

    private static int quickselectsort(int[] arr, int lo, int hi, int k) {

        // Extracting Pivot element
        int pivot = arr[hi];

        // partition of array
        int pi = partition(arr, pivot, lo, hi);

        // condition check
        // if k is greater than pivot index then we have to check pi+1 to high
        // if k is less than pivot index than we have to call recursive fun lo to pi-1
        if (k > pi) {
            return quickselectsort(arr, pi + 1, hi, k);
        } else if (k < pi) {
            return quickselectsort(arr, lo, pi - 1, k);
        } else {
            return arr[pi];
        }
    }

    // Array Partiton
    private static int partition(int[] arr, int pivot, int lo, int hi) {

        int i = lo, j = lo;

        while (i <= hi) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else {
                i++;
            }
        }

        return j - 1;
    }

}
