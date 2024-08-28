import java.util.Scanner;

public class thlab3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input array size");
        int n = sc.nextInt();
        System.out.println("Enter element of array");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element which you wanna search!");
        int tar = sc.nextInt();

        boolean found = searchtar(arr,tar);
        if (found) {
            System.out.println("Element " + tar + " found in the array.");
        } else {
            System.out.println("Element " + tar + " not found in the array.");
        }

    }

    public static boolean searchtar(int[] arr,int tar) {

        for (int num : arr) {
            if (num == tar) {
                return true;
            }
        }
        return false;
    }
}