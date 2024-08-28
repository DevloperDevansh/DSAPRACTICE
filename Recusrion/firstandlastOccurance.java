package RecursionQuestion;

public class firstandlastOccurance {

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        checkfirstandlast(str, 0, 'a');
    }

    public static int first = -1;
    public static int last = -1;

    public static void checkfirstandlast(String str, int idx, char ch) {
        // base case
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        // extracting current character
        char currchar = str.charAt(idx);

        // And Check given element for finding first and last occurance
        if (currchar == ch) {
            if (first == -1) { // if first == -1 then update otherwise will not
                first = idx;
            } else {
                last = idx;
            }
        }
        // Recursive call
        checkfirstandlast(str, idx + 1, currchar);

    }

}
