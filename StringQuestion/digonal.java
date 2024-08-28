import java.util.Scanner;

public class digonal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int primarysum = 0;
        int secondarysum=0;

        int [][]arr = new int[n][m];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        //output
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

      
        //digonal sum
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                if(i==j){
                    primarysum +=arr[i][j];
                }else if(i!=arr.length-1-i){
                    secondarysum+=arr[i][arr.length-i-1];
                }
            }
        }
        System.out.println(primarysum);
        System.out.println(secondarysum);
    }
    
}
