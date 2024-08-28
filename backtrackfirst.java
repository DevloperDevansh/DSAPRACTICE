public class backtrackfirst {
    
    public static void main(String[] args) {
        String str = "abc";
        findsub(str,"",0);
    }

    public static void findsub(String str, String ans, int idx) {
       //base case
       if(idx==str.length()){
         System.out.println(ans+" ");
         return;
       }

       char currchar = str.charAt(idx);
       //yes choice
        findsub(str, ans+currchar, idx+1);

       //No choice
       findsub(str, ans, idx+1);
    }
}
