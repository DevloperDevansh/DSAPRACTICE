import java.util.Scanner;
import java.util.Stack;

public class findcelebrity {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        //output
        System.out.println("********Matrix*******");
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        findcelebritys(arr);


    }

    public static void findcelebritys(int[][] arr) {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            st.push(i);
        }

        while(st.size()>=2){
            int j = st.pop();
            int i = st.pop();

            if(arr[i][j]==1){
                //if i knows j -> then i is not celebrity
                st.push(j);
            }else{
                //if i does't know -> then j is not celebrity
                st.push(i);
            }
        }

        int pot = st.pop();
        boolean flag = true;
        for(int i=0;i<arr.length;i++){
            if(i!=pot){
              if(arr[i][pot]==0 || arr[pot][i]==1){
                flag = false;
                break;
              }

            }
        }
        if(flag == true){
            System.out.println(pot);
        }else{
            System.out.println("None");
        }
    }
    
}
