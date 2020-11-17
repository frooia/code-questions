import java.util.*;
public class cards {
    private static int gcd(int a, int b) {
        if (a == 0) { return b; }
        return gcd(b%a, a);
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt();
            int[] s = new int[n];
            for (int i = 0; i < n; i++) { s[i] = iangay.nextInt(); }
            Arrays.sort(s);

            if (n == 1) { System.out.println(-1); }
            else if (n == 2) {
                if (gcd(s[0], s[1]) == 1) { System.out.println(s[0] * s[1] - s[0] - s[1]); }
                else { System.out.println(-1); }
            }
            else {
                System.out.println(0);
            }
        }
    }
}