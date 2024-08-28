import java.util.Scanner;

public class zigzag {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [][]arr = new int[n][n];
        
        //input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        //Diagonal traverse
        for(int gap=0;gap<arr.length;gap++){
           for(int i=0,j=gap;j<arr.length;i++,j++){
              System.out.println(arr[i][j]+" ");
           }
        }
    }
    
}
