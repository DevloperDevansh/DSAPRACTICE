package StringQuestion;

public class printduplicatestring {
    public static void Removeduplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        //Base case
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        //work
        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true){
           Removeduplicate(str, idx+1, newstr, map); //recursion call
        }else{
           map[currchar-'a'] = true;
           Removeduplicate(str, idx+1, newstr.append(currchar), map); //Recursion call
        }
    }
    public static void main(String[] args) {
       String str = "appnnaacollege";
       Removeduplicate(str, 0,new StringBuilder(""),new boolean[26]);
    }
    
}
