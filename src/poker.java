import java.util.*;
public class poker {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = iangay.nextInt();
            int m = iangay.nextInt();
            int k = iangay.nextInt();
            if (m <= n / k) {
                System.out.println(m);
            }
            else {
                System.out.println(n/k - (int)Math.ceil((m - n/k) / (double)(k-1)));
            }
        }
    }
}