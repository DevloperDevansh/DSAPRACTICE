public class backtrackpermu {

    public static void printpermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            //remove character and add
            String newstr = str.substring(0, i)+str.substring(i+1);
            printpermutation(newstr, ans+currchar);
        }
    } 
    public static void main(String[] args) {
        String str  = "abc";
        printpermutation(str, "");
    }
    
}
