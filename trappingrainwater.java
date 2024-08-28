public class trappingrainwater {

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trapping = trap(height);
        System.out.println(trapping);
    }
    public static int trap(int[] height) {
        int n = height.length;
        //create two array left & right
        int left[] = new int[n];
        int right[] = new int[n];
        //forward traversing
        left[0] = height[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        //backward traversing
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        //return ans using formula left & right minimum - height[i]
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += (Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}
    

