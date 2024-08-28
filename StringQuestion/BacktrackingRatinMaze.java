public class BacktrackingRatinMaze {

    static int n;

    
    public static void printsvisited(int[][] visited) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             System.out.print(visited[i][j]+"->");
            }
            System.out.println();
        }
    }

    




    public static boolean solveMazeutil(int[][] maze, int n, int i,  int j, int[][] visited,String temp) {
        //Base case
        if(i==n-1 && j==n-1 && maze[i][j]==1){
            visited[i][j] = 1;
            return true;
        }


        //check
        if(isSafe(maze,i,j)==true){
            if(visited[i][j]==1){
                return false;
            }

            visited[i][j] = 1;
            if(solveMazeutil(maze, i+1, j, visited)){
                return true;
            }
            if(solveMazeutil(maze, i, j+1, visited)){
                return true;
            }
            visited[i][j] = 0;
            return false;
        }
        return false;
        
    }
   
    public static boolean isSafe(int [][]maze,int i,int j){

        if (i>=0 && i<n && j>=0 && j<n && maze[i][j]==1){
            return true;
        }
        return false;
         
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };

       int n = maze.length;
       int [][]visited = new int[n][n];
       solveMazeutil(maze, n, 0,0, visited,"");
  
    }

   
    
}
