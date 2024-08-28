public class findpairsum {

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int X = 16;
        int N = arr.length;
 
        if (pairInSortedRotated(arr, N, X))
            System.out.print("true");
        else
            System.out.print("false");
    }

    public static boolean pairInSortedRotated(int arr[],int n,int x){
        //find pivot element
        int i;
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        // l is now index of smallest element
        int l = (i+1)%n;
        // r is now index of largest element
        int r = i;

        while(l!=r){
            // If we find a pair with sum x, we
            // return true
            if(arr[l]+arr[r]==x){
                return true;
            }

            // If current pair sum is less, move
            if(arr[l]+arr[r]<x){
                l = (l+1)%n; //move higher sum side
            }else{
                r = (n+r-1)%n;//move lower sum side
            }
        }
        return false;
    }
    
}

    

