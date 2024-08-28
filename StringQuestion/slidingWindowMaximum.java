import java.util.Scanner;
import java.util.Stack;

public class slidingWindowMaximum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Array input size");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter key number");
        int k = scn.nextInt();

        slidingWindowMax(arr,k);
        
    }

    public static void slidingWindowMax(int[] arr,int k) {
        
        
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[arr.length];
        st.push(arr.length-1);
        nge[arr.length-1] = arr.length;

        //next greater element
        for(int i=arr.length-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
              st.pop();
            }
            //second step if else
            if(st.isEmpty()){
               nge[i] = arr.length; 
            }else{
                nge[i] = st.peek();
            }
            //3-step Push
            st.push(i);
        }

        //sliding window maximum logic
        int j = 0;
        for(int i=0;i<=arr.length-k;i++){
           if(j<i){
             j = i;
           }
           while(nge[j]<i+k){
            j = nge[j];
           }
    
           System.out.print(arr[j]+" ");
        }

    }
    
}
