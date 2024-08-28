import java.util.LinkedList;
import java.util.Queue;

public class Interleavequeues {


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleaveQueue(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }

    }

    public static void interleaveQueue(Queue<Integer> q) {
        Queue<Integer> firstQueue = new LinkedList<>();
        int size = q.size();
        for(int i=0;i<size/2;i++){
            firstQueue.add(q.remove());
        }

        while(!firstQueue.isEmpty()){
            q.add(firstQueue.remove());
            q.add(q.remove());
        }
    }
    
}
