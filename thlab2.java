import java.util.Scanner;

public class thlab2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        

        System.out.println("Enter first array input");
        int n1 = scn.nextInt();
        
        int arr1[] = new int[n1];
        System.out.println("Enter elememt of first array");
        for(int i=0;i<arr1.length;i++){
         arr1[i] = scn.nextInt();
        }

        largest(arr1);
        double avg =  calculateavg(arr1);
        System.out.println("Average of all elements in the array: " + avg);

    }

    private static double calculateavg(int[] arr1) {
        int totalsum =0;
        for (int i : arr1) {
            totalsum +=i;
        }
        return  (double)totalsum/arr1.length;
    }

    private static void largest(int[] arr1) {
        int lar =0;
        for (int i=0;i<arr1.length;i++) {
            if(arr1[i]>lar){
                lar = arr1[i];
            }
        }
        System.out.println("Largest element in array ="+lar);
    }


    
}
