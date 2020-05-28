import java.util.*;
public class divisible {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = iangay.nextInt();
            int k = iangay.nextInt();
//            long x = (k-1) / (n-1) * n + k % (n-1);
//            if (k % n == 0 && k != n) { x += k / n; }
//            else if (n-1 == k) { x += k; }
            long curr = k;
            long m = k - k / n;
            while (m < k) {
                curr += k - m;
                m = curr / n * (n-1) + curr % n;
            }
            System.out.println(curr);
        }
    }
}