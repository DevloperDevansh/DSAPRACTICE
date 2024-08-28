package RecursionQuestion;

public class checkarrayissorted {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(ischecksorted(arr, 0));
    }

    private static boolean ischecksorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            // array is sorted
            return ischecksorted(arr, idx + 1); // recursive call
        } else {
            return false;
        }
    }

}
