import java.util.Scanner;

public class wavetraversal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("*********************");
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){  //even
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i][j]);
                }
            }else{ //for odd
                for(int i=arr.length-1;i>=0;i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
        
    }
    
}
