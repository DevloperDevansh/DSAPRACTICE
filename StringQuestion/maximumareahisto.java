import java.util.Scanner;
import java.util.Stack;

public class maximumareahisto {

    public static int maxarea(int height[]){

        int maxArea = 0;
        int []nsl = new int[height.length];
        int []nsr = new int[height.length];

 
        //next Smaller right
        Stack<Integer> st = new Stack<>();

        for(int i=height.length-1;i>=0;i--){
           while(!st.isEmpty() && height[st.peek()]>=height[i] ){
            st.pop();
           }

           if(st.isEmpty()){
               //-1
               nsr[i] = height.length;
           }else{
               //top
               nsr[i] = height[st.peek()];
           }
           st.push(i);
        }

        //next Smaller left
        st = new Stack<>();
        for(int i=0;i<height.length;i++){
           while(!st.isEmpty() && height[st.peek()]>=height[i] ){
            st.pop();
           }

           if(st.isEmpty()){
               //-1
               nsl[i] = -1;
           }else{
               //top
               nsl[i] = st.peek();
           }
           st.push(i);
        }


        //current area
        
        for (int i = 0; i< height.length; i++) {
            int h = height[i];
            int width = nsr[i] -nsl[i] - 1;
            int currArea = h * width;
            maxArea = Math.max(currArea, maxArea); 
        }
        return maxArea;
    }
    public static int maximalrectangle(int [][]mat){

        int currrow[] = mat[0];
        int maxAns = maxarea(currrow);
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    currrow[j] += 1;
                }else{
                    currrow[j] = 0;
                }
            }
            int currAns = maxarea(currrow);
            maxAns = Math.max(maxAns,currAns);
        }
        return maxAns;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
        
        int maximalrec = maximalrectangle(arr);
        System.out.println(maximalrec);


    }
    
}
