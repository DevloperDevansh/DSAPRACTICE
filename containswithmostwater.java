public class containswithmostwater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};

        int mostwater = logicofmostwater(height);
        System.out.println(mostwater);
    }

    public static int logicofmostwater(int[] height) {
        int i=0;
        int j=height.length-1;
        int water = 0;
        while(i<j){
           int width = j-i; //difference of index of j and i
           int ht = Math.min(height[i],height[j]); //minimum of height of i and height of j
           water = Math.max(water, ht*width);// max of previous water & multiply of height & width
          if(height[i]<height[j]){ //if height of i is less than height of j value then i increase else j Decrease
            i++;
          }else{
            j--;
          }
        }
        return water;
    }
}
