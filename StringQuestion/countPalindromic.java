public class countPalindromic {

    public static void main(String[] args) {
        String str = "bccb";

        boolean[][] dp =  new boolean[str.length()][str.length()];
        int count = 0;

        //we traverse on digonal

        for(int gap=0;gap<str.length();gap++){

            for(int i=0,j=gap;j<dp.length;i++,j++){
                if(gap==0){
                    dp[i][j]=true;
                }else if(gap==1){
                    if(str.charAt(i)==str.charAt(j)){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }
                
                if(dp[i][j]==true){
                    count++;
                }

            }
        }
        System.out.println(count);
    }

   
    
}
