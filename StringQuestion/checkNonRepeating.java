import java.util.LinkedList;
import java.util.Queue;

public class checkNonRepeating {

    public static void printNonrepeatingchar(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i); //chracter access
            q.add(ch);   //adding character in queue
            freq[ch-'a']++; //frequency array put ffreq and increase

            while(!q.isEmpty() && freq[q.peek()-'a']>1){  //check till i find 1st non repeating charcter
                q.remove();                         
            }

            if(q.isEmpty()){
                System.out.println(-1+" ");
            }else{
                System.out.println(q.peek()+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabccxb";

       printNonrepeatingchar(str);
    }
    
}
