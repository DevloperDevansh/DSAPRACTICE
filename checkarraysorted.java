public class checkarraysorted {

    public static void main(String[] args) {
        int arr[] = {1,3,5};
        System.out.println(sortedcheck(arr,0));
    }

    public static boolean sortedcheck(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return sortedcheck(arr, idx+1);
        }else{
            return false;
        }
        
    }
    
}
