import java.util.*;
public class celex {
    private static int choose(long n, long k) {
        if (n == k || k == 0) { return 1; }
        return choose(n - 1, k - 1) + choose(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int x1 = iangay.nextInt(); int y1 = iangay.nextInt();
            int x2 = iangay.nextInt(); int y2 = iangay.nextInt();
            int x = x2 - x1; int y = y2 - y1;
            System.out.println(choose(x+y, x));
        }
    }
}