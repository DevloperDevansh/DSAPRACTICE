package RecursionQuestion.sorting;

public class insertionsort {

    public static void main(String[] args) {
        // array decalaration with element
        int arr[] = { 1, 5, 3, 2, 6 };

        // logic of insertion sort
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) { // check condition
                    int temp = arr[j];
                    arr[j] = arr[j + 1]; // swapping
                    arr[j + 1] = temp;
                } else {
                    break;
                }
            }
        }

        // for printing sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
