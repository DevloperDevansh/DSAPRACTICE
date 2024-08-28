package RecursionQuestion;

public class fibonacci {

    private static int printfibonacci(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }

        int fn1 = printfibonacci(n - 1);
        int fn2 = printfibonacci(n - 2);

        int fn = fn1 + fn2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 25;
        printfibonacci(n);
        System.out.print(printfibonacci(n));
    }

}
