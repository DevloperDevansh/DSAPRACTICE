package RecursionQuestion;

import java.util.ArrayList;

public class getsubsequence {

    public static void main(String[] args) {
        // Get subsequence code here
        String str = "abc";

        // fuction call of getsubsequence
        System.out.println(Getsubsequences(str) + " ");
    }

    public static ArrayList<String> Getsubsequences(String str) {

        // base case
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // logic
        char currchar = str.charAt(0); // a
        String ros = str.substring(1); // bc

        // creating arraylist for storing recans
        ArrayList<String> recans = Getsubsequences(ros); // [--,-c,b-,bc]

        // create arraylist for storing subsequence
        ArrayList<String> myans = new ArrayList<>();

        // loop
        for (int i = 0; i < recans.size(); i++) {
            String s = recans.get(i);
            myans.add(s);
        }

        // for-each loop
        for (String s : recans) {
            myans.add(currchar + s);
        }

        return myans;
    }

}
