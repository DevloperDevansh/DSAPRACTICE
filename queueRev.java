import java.util.*;
import java.util.LinkedList;

public class queueRev {



    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        queuereversal(q);

        //print q
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }

    }

    public static void queuereversal(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();

        while(!q.isEmpty()){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

    }
    
}
