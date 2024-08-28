package StringQuestion;

public class tilingproblem {

    public static int  tilesolve(int n){
        if(n==0||n==1){
            return 1;
        }

        //vertical choice
        int fnm1 = tilesolve(n-1);
        
        //horizontal choice
        int fnm2 = tilesolve(n-2);

        //total ways
        int totalways = fnm1 + fnm2;
        return totalways;

    }
    public static void main(String[] args) {
       int n = 5;
        System.out.println(tilesolve(n));
         
    }
    
}
