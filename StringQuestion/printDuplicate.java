import java.util.Scanner;

public class printDuplicate {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter String::");
        String str = scn.nextLine();

        printduplicatstring(str);
    }

    private static void printduplicatstring(String str) {
        int[] freq = new int[26];
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch - 'a'] > 1) {
                System.out.println("Duplicate str::" + ch); // print duplicate
                freq[ch - 'a'] = 0; // Mark the character as printed to avoid duplicates in the output
            }
        }
    }
}