import java.util.Stack;

public class reversestring {


    public static void main(String[] args) {
        String str = "abcde";

       String rev =  revesdtr(str);
       System.out.println(rev);
    }

    private static String revesdtr(String str) {

        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            char curr = st.pop();
            sb.append(curr);
        }
        str = sb.toString();
        return str;




    }
    
}
