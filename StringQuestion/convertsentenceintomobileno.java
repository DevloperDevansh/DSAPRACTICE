package StringQuestion;


public class convertsentenceintomobileno {
    
    private static final int Position = 0;

    public static void main(String[] args) {
         // storing the sequence in array
        String str[]
            = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };

        String input = "apna";
        System.out.println(printSequence(str, input));
    }

    public static String printSequence(String arr[], String input)
    {
        String ans = "";
        int n = input.length();
        for (int i = 0; i < n; i++) {
           
            char ch = Character.toUpperCase(input.charAt(i)); //converting character into upper case
            if (input.charAt(i) == ' ')   // Checking for space
                ans = ans + "0";

            else {
                // Calculating index for each
                // character
                int position = ch - 'A';
                ans = ans + arr[position];
            }
        }

        // Output sequence
        return ans;
    }
}
