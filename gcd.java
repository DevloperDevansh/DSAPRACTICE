import java.util.Scanner;

public class gcd {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int on1 = n1;
        int on2 = n2;

        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n2 = rem;
            n1 = n2;
        }

        int gcd = n2;
        System.out.println("Gcd::" + gcd);
        int lcm = (on1 * on2) / gcd;
        System.out.println("Lcm::" + lcm);

    }

}
