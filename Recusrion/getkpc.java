package RecursionQuestion;

import java.util.ArrayList;

public class getkpc {

    public static void main(String[] args) {
        String str = "789";

        // function call
        System.out.println(getkeypadcombination(str));
    }

    static String[] arr = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    private static ArrayList<String> getkeypadcombination(String str) {

        // base case
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // logic
        // extract currcharacter
        char currchar = str.charAt(0);
        String ros = str.substring(1);

        // store recans in arraylist
        // faith
        ArrayList<String> recans = getkeypadcombination(ros);
        ArrayList<String> myans = new ArrayList<>();
        // split str into integer
        // currchar-'0' -> for converting string into integer
        String codedstr = arr[currchar - '0'];

        // for loop
        for (int i = 0; i < codedstr.length(); i++) {
            char c = codedstr.charAt(i);
            for (String s : recans) {
                myans.add(c + s);
            }
        }
        return myans;

    }

}
