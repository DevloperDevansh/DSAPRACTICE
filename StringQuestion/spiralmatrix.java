import java.util.Scanner;

public class spiralmatrix {

     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m =scn.nextInt();

        int [][]arr = new int[n][m];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int tne = n*m;
        int cnt = 0;

        while(cnt<tne){
            //left wall
            for(int i=minr,j=minc;i<=maxr && cnt<tne ;i++){
                System.out.println(arr[i][j]+" ");
                cnt++;
            }
            minc++;
            //bottam wall
            for(int i=maxr,j=minc;j<=maxc && cnt<tne;j++){
                System.out.println(arr[i][j]+" ");
                cnt++;
            }
            maxr--;
            //right wall
            for(int i=maxr,j=maxc;i>=minr && cnt<tne;i--){
                System.out.println(arr[i][j]+" ");
                cnt++;
            }
            maxc--;
            //top wall
            for(int i=minr,j=maxc;j>=minc && cnt<tne ;j--){
                System.out.println(arr[i][j]+" "); 
                cnt++;
            }
            minr++;
            System.out.println();
        }
     }
    
}
