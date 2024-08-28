public class interfacesss {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
    
}

interface chessPlayer{
    void moves();  //it is provide totally abstraction
                   //Interface is a blueprint of class
}

class Queen implements chessPlayer{

    public void moves(){
      System.out.println("up,down,left,right,digonal(in 4 steps)");
    }
}

class Rook implements chessPlayer{

    public void moves(){
      System.out.println("up,down,left,right");
    }

}

class King implements chessPlayer{

    public void moves(){
      System.out.println("up,down,left,right,digonal(in 1 step)");
    }

}

class Pawn implements chessPlayer{

    public void moves(){
      System.out.println("up,digonal(in 1 step)");
    }

}
