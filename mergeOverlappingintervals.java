import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class mergeOverlappingintervals {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][2];
        for(int j=0;j<n;j++){
            arr[j][0] = scn.nextInt();
            arr[j][1] = scn.nextInt();
        }

        mergeIntervals(arr);
        
    }
    /**
     * @param arr
     */
    public static void mergeIntervals(int [][]arr){
        pair []pairs = new pair[arr.length];

        for(int i=0;i<arr.length;i++){
            pairs[i] = new pair(arr[i][0],arr[i][1]);
        }
        //sort array
        Arrays.sort(pairs);
        //pushing intervals
        Stack<pair> st = new Stack<>();
        for(int i=0;i<pairs.length;i++){
            if(i==0){
                st.push(pairs[i]);
            }else{
                pair top = st.peek();
                if(pairs[i].st>=top){
                    st.push(pairs[i]);
                }else{
                    top.end = Math.max(top.end, pairs[i].end);
                }

            }
        }

        //Result stack
        Stack<pair> rs = new Stack<>();
        while(st.size()>0){
            rs.push(st.pop());
        }
        while(rs.size()>0){
            pair p = rs.pop();
            System.out.println(p.st+ " "+p.end);
        }

       
    }

    public static class pair implements Comparable<pair> {
      int st;
      int end;
        pair(int st,int end){
         this.st = st;
         this.end = end;
        }
        public int compareTopair(pair other){
            if(this.st!=other.st){
                return this.st - other.st;
            }else{
              return this.end - other.end;
            }
        }
    }
    
}
