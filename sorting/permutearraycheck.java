package RecursionQuestion.sorting;

public class permutearraycheck {

    public static void main(String[] args) {
        // Taking two array
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 9, 8, 7 };

        // K value
        int k = 10;

        // permute arrray fuction call
        boolean b = permutearray(arr1, arr2, k);
        if (b == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static boolean permutearray(int[] arr1, int[] arr2, int k) {

        if (arr1.length != arr2.length) {
            return false;
        }

        // logic of permute array

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] + arr2[i] >= k) {
                return true;
            }

        }
        return false;

    }

}
