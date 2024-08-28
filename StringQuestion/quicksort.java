public class quicksort {

    public static void quick(int arr[],int si,int ei){
        if(si>=ei){
           return;
        }
        int pidx = partition(arr,si,ei);
        quick(arr, si, pidx-1);
        quick(arr, pidx+1, ei);
    }

    public static int partition(int arr[],int si,int ei){

        int pivot = arr[ei];
        int i = si-1; //to make place for els smaller than pivot


        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,7,8,3,4};
        quick(arr, 0, arr.length-1);
        printarr(arr);

    }

    private static void printarr(int[] arr) {
        System.out.println("*******Sorted Array********");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
