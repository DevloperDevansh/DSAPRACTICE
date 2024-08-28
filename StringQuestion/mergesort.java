import java.util.Scanner;

public class mergesort {

    public static void divide(int []arr,int si,int ei){
        if(si>=ei){
            return;
        }
        //mid
        int mid = si + (ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];

        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        //left part 
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        //right part 
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //copy
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }

    }

    public static void printarr(int[] arr) {
        System.out.println("*******************Sorted Array***************");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int []arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        divide(arr, 0, arr.length-1);
        printarr(arr);
    }

    
    
}
