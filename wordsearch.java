
public class wordsearch {


    public static void main(String[] args) {
      
        int n = 4;
        int m = 3;

        char [][]board = {{'A','B','C','E','S','F','C','S','A','D','E','E'}};

        WordSearch(board,"ABCCED");
        
    }

    public static boolean WordSearch(char[][] board, String word) {
      int m = board.length;
      int n = board[0].length;

      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(board[i][j]==word.charAt(0)&&dfs(board,i,j,0,word)){
                return true;
            }
        }
      }
      return false;

    }

    public static boolean dfs(char[][] board, int i, int j, int index, String word) {
        int m = board.length;
        int n = board[0].length-1;

        boolean[][] visited = new boolean[m][n];
        //base case


        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(i)||visited[i][j]){
            return false;
        }
        visited[i][j] = true;
        boolean found = dfs(board, i+1, j, index+1, word)||dfs(board, i-1, j, index+1, word)||dfs(board, i, j+1, index+1, word)||dfs(board, i, j-1, index+1, word);
        visited[i][j] = false;
        return found;
    }
    
}
