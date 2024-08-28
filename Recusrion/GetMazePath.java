package RecursionQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter n::");
        int n = scn.nextInt();
        System.out.println("Enter m::");
        int m = scn.nextInt();

        ArrayList<String> mazepath = getmazepaths(1, 1, n, m);
        System.out.println(mazepath);

    }

    private static ArrayList<String> getmazepaths(int sr, int sc, int dr, int dc) {
        // base case code here
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        // if we put my recursion call in if condition we have to declare arraylist
        // outside of method
        // for iterating
        ArrayList<String> recans1 = new ArrayList<>();
        ArrayList<String> recans2 = new ArrayList<>();

        // horizontal call
        if (sc < dc) {
            recans1 = getmazepaths(sr, sc + 1, dr, dc);
        }

        // vertical call
        if (sr < dr) {
            recans2 = getmazepaths(sr + 1, sc, dr, dc);
        }

        // creating arraylist for storing ans
        ArrayList<String> ans = new ArrayList<>();

        // for-each loop for horizontal
        for (String hpath : recans1) {
            ans.add("h" + hpath);
        }

        // for-each loop for vertical
        for (String vpath : recans2) {
            ans.add("v" + vpath);
        }

        return ans;
    }

}
