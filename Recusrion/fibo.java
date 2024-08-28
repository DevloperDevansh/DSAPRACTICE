package RecursionQuestion;

public class fibo {

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a); // print a
        System.out.println(b); // print b
        int n = 7;
        printfib(a, b, n - 2); // function call
    }

    private static void printfib(int a, int b, int n) {
        // base case
        if (n == 0) {
            return;
        }

        // addind a and b and store in c
        int c = a + b;
        System.out.println(c);
        printfib(b, c, n - 1); // recursive call

    }

}
