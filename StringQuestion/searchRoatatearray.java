public class searchRoatatearray {

    public static int search(int[] arr, int target, int si, int ei) {
        if(si>ei){
            return -1;
        }
        
        int mid = si+ (ei-si)/2;

        //case found  
        if(arr[mid]==target){
            return mid;
        }
        //mid on L1
        if(arr[si]<=mid){
            //case a: left
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid);
            }
        }else{ 
            //case b: right
            return search(arr, target, mid+1, ei);
        }

        //mid on line2
        if(arr[mid]<arr[ei]){
          //case c:right
          if(arr[mid]<=target && target<=arr[ei]){
            return search(arr, target, mid+1, ei);
          }else{
            return search(arr, target, si,mid-1);
          }
             
        }
        return mid;

    }

    public static void main(String[] args) {
        int []arr = {4,5,6,7,0,1,2};
        int target = 0;

       int targetidx =  search(arr,target,0,arr.length-1);
       System.out.println(targetidx);
    }

   
    
}
