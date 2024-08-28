import java.util.Scanner;

public class twodarrays {

    public static void main(String[] args) {
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
        System.out.print("Enter Key Value");
        int key = scn.nextInt();
        keysearch(arr,key);
    }

    private static boolean keysearch(int[][] arr, int key) {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Found at cell("+i+","+j+")");
                   return true;
                }
               
            }
        }
        System.out.println("Not found");
        return false;


    }
    
}
