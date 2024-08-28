import java.util.Stack;

public class validparanthese {

    public boolean isvalid(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // openning
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                // closing
                if (st.isEmpty()) {
                    return false;
                }
                // for every pair we check
                if ((st.peek() == '(' && ch == ')')
                        || (st.peek() == '{' && ch == '}')
                        || (st.peek() == '[' && ch == ']')) {

                    st.pop();
                } else {
                    return false;
                }
            }
        }
        // last me we check stack is empty then return true
        // else false
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String str = "({})[]";

    }

}
