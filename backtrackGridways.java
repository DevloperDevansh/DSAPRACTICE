public class backtrackGridways {

    public static void main(String[] args) {
        int n = 3,m = 3;

        int totalways = Gridways(0,0,n,m);
        System.out.println("Total ways ::"+totalways);
    }

    private static int Gridways(int i, int j, int n, int m) {
       //Base case
       if(i==n-1 && j==m-1){
        return 1;
       }

       if(i==n || j==n){
        return 0;
       }

        //w1 down
        int w1 = Gridways(i+1, j, n, m);
        //w2 right
        int w2 = Gridways(i, j+1, n, m);

        return w1 + w2;
    }
    
}
