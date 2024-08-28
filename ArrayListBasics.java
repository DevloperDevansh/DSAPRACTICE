import java.util.*;
public class ArrayListBasics{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(19);
        list.add(34);
        list.add(45);
        list.add(21);


        int max = Integer.MIN_VALUE;
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }
        System.out.println(max);
        // list.set(0, 9);
        // System.out.println(list);
        // //get element
        // System.out.print(list.get(3)+" ");
        // //remove element
        // System.out.println(list.remove(3));
        // //print after remove
        // System.out.println(list);
       
        // for(int i=list.size();i>=0;i--){
        //   System.out.print(list.get(i)+" ");
        // }
       
    }
    
}
