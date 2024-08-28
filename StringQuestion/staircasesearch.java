import java.util.Scanner;

public class staircasesearch {

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

        //output
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int key = scn.nextInt();
        search(arr,key);
    }
    public static boolean search(int [][]arr,int key){

        int row = 0,col = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
              System.out.println("found at("+row+","+col+")");
              return true;
            }else if(key < arr[row][col]){
                col--;
            }else if(key>arr[row][col]){
                row++;
            }
        }
        return  false;


    }
    
}
