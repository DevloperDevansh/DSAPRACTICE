public class backtrackNqueen {


    public static void NQueens(char[][] board, int row) {
        //base case
        if(row==board.length){
            printNquees(board);
            return;
        }

        //kaam
        for(int j=0;j<board.length;j++){
            if(Issafe(board,row,j)){
              board[row][j] = 'Q';
              NQueens(board, row+1);
              board[row][j] = 'X';
            }
        }
    }


    public static boolean Issafe(char[][] board, int row,int col) {

        //vertical
        for(int i=row-1;i>=0;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        
        //diagonal right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void printNquees(char[][] board) {
       System.out.println("********Chess Board********");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        NQueens(board,0);
    }

   
}
