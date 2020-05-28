import java.util.*;
public class balanced2 {
    public static void main(String[] args) {
        long[] powers = new long[31]; powers[0] = 1;
        for (int i = 1; i < 31; i++) {
            powers[i] = powers[i-1] * 2;
        }
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = iangay.nextInt();
            long big = powers[n];
            for (int j = 1; j < n / 2; j++) {
                big += powers[j];
            }
            long small = 0;
            for (int j = n / 2; j < n; j++) {
                small += powers[j];
            }
            System.out.println(big-small);
        }
    }
}