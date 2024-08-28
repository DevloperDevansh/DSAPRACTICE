import java.util.HashMap;

public class isomorphic {

    public static void main(String[] args) {
        String str = "aab";
        String tar = "xxy";

        boolean ans = checkIsomorphicString(str, tar);
        System.out.println(ans);
    }

    private static boolean checkIsomorphicString(String str, String tar) {

        if (str.length() != tar.length()) {
            return false;
        }

        // creating two hashmap
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();

        // loop
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            char ch2 = tar.charAt(i);

            if (map1.containsKey(ch1) == true) {
                if (map1.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (map2.containsKey(ch2) == true) {
                    return false;
                } else {
                    map1.put(ch1, ch2);
                    map2.put(ch2, true);
                }
            }
        }

        // If the loop finishes without returning false, then the strings are
        // isomorphic.
        return true;
    }
}