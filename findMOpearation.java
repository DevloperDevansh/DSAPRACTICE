public class findMOpearation {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 4, 5, 9, 1 };
        int countnumberofoperation = minopeartion(arr);
        System.out.println(countnumberofoperation);
    }

    private static int minopeartion(int[] arr) {
       int i=0;
       int j=arr.length-1;
       int ans = 0;

        while(i<=j){
          if(arr[i]==arr[j]){
            i++;
            j--;
          } else{
              if(arr[i]<arr[j]){
                i++;
                arr[i]+= arr[i-1];
                ans++;
              }else{
                j--;
                arr[j]+=arr[j+1];
              }
           }
        }

      return ans;
}

}
