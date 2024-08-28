package RecursionQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Getstairpath {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Input any number");
        int n = scn.nextInt();
        System.out.println();

        System.out.println(getpaths(n));

    }

    private static ArrayList<String> getpaths(int n) {
        // Base case
        // if n equal = 0 then return empty list
        if (n == 0) {
            ArrayList<String> pos = new ArrayList<>();
            pos.add("");
            return pos;
        }

        // if n is negative
        if (n < 0) {
            ArrayList<String> neg = new ArrayList<>();
            return neg;
        }

        // recursion calls
        ArrayList<String> recans1 = getpaths(n - 1); // n-1 path
        ArrayList<String> recans2 = getpaths(n - 2); // n-2 path
        ArrayList<String> recans3 = getpaths(n - 3); // n-3 path

        // creating arraylist for storing ans
        ArrayList<String> ans = new ArrayList<>();

        // for-each loop
        for (String s : recans1) {
            ans.add(1 + s);
        }

        // for addind 2
        for (String s : recans2) {
            ans.add(2 + s);
        }

        // for adding 3
        for (String s : recans3) {
            ans.add(3 + s);
        }

        return ans;
    }

}
