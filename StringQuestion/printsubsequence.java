package StringQuestion;

public class printsubsequence {

    public static void printsub(String str,int idx,String newstr){
        //Base case
        if(idx==str.length()){
           System.out.println(newstr);
           return;
        }

        //first character
        char currchar = str.charAt(idx);

        //choose to be
        printsub(str, idx+1, newstr+currchar);

        //choose not to be

        printsub(str, idx+1, newstr);

    }
    public static void main(String[] args) {
        String str = "abc";
        printsub(str, 0, "");
    }
    
}
