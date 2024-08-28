import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthsmallest {

    public static void main(String[] args) {
        int arr[] = {20,10,60,30,50,40};
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();

        int smallest = findsmallest(arr,k);
        System.out.println(smallest);

    }

    public static int findsmallest(int[] arr, int k) {
 
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        
        for(int i=k;i<arr.length;i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    
}
