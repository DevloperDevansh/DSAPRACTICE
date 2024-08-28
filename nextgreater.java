import java.util.Stack;

public class nextgreater {


    public static void main(String[] args) {
        
        int arr[] = {6,8,0,1,3};

        Stack<Integer> st = new Stack<>();  //create stack
        int []nextg = new int[arr.length];  //for storing nextgreater element

        for(int i=arr.length-1;i>=0;i--){
          //1-while
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
          //2-if- else
            if(st.isEmpty()){
                nextg[i] = -1;
            }else{
                nextg[i] = arr[st.peek()];
            }

          //push 
            st.push(i);
        }  

        for(int i=0;i<nextg.length;i++){
            System.out.print(nextg[i]+" ");
        }

        

    }
    
}
