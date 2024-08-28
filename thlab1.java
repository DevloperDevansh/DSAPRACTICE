import java.util.Scanner;

class Thlab1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first array input");
        int n1 = scn.nextInt();
        
        int arr1[] = new int[n1];
        System.out.println("Enter elememt of first array");
        for(int i=0;i<arr1.length;i++){
         arr1[i] = scn.nextInt();
        }
        
        System.out.println("Enter seconf array input");
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter elememt of secoond array");
        for(int i=0;i<arr2.length;i++){
            arr2[i] = scn.nextInt();
        }
 
        int sum1 = caluculatesum1(arr1);
        int sum2 = calculatesum2(arr2);
        if(sum1>sum2){
            System.out.println("The first array has a higher sum: " + sum1);
        }else if (sum2 > sum1) {
            System.out.println("The second array has a higher sum: " + sum2);
        } else {
            System.out.println("Both arrays have the same sum: " + sum1);
        }

    }

    public static int calculatesum2(int[] arr2) {
        int sum2 = 0;
        for (int i : arr2) {
            sum2 +=i;
            
        }
        return sum2;
    }

    public static int caluculatesum1(int[] arr1) {
        int sum1 = 0;
        for (int i : arr1) {
            sum1 += i;
        }
        return sum1;
    }
    
}
