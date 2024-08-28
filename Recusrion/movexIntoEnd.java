package RecursionQuestion;

public class movexIntoEnd {

    public static void main(String[] args) {
        String str = "axbcxxd";
        movexend(str, 0, 0, "");
    }

    private static void movexend(String str, int idx, int count, String newstr) {
        // base case
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += 'x';
            }

            System.out.print(newstr + " ");
        } else {
            // logic
            char currchar = str.charAt(idx);
            if (currchar != 'x') {
                newstr += currchar;
            } else {
                count++;
            }
            // Increment idx and make the recursive call
            movexend(str, idx + 1, count, newstr);
        }
    }
}
