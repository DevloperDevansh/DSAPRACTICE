package RecursionQuestion;

public class factorial {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int fnm1 = factorial(n - 1);
        int factorial = n * fnm1;
        return factorial;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

}
