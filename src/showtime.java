import java.util.*;
public class showtime {
    private static long doubleFactorial(int n) {
        if (n == 1 || n == 0) { return 1; }
        return n * doubleFactorial(n-2);
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int input = iangay.nextInt();
        int n = input / 1000; int mod = input % 1000;
        System.out.println(n+" "+mod);
        long f = doubleFactorial(n);
        System.out.println(f);
        System.out.println(f % mod);
    }
}
