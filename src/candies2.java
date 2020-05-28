import java.util.*;
public class candies2 {
    public static void main(String[] args) {
        long[] powers = new long[31]; powers[0] = 2;
        for (int i = 1; i < 31; i++) { powers[i] = 2 * powers[i-1]; }
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = iangay.nextInt();
            int j = (int)(Math.log(n) / Math.log(2)) + 1;
            while (j >= 0) {
                if ( n % (powers[j] - 1) == 0) { System.out.println(n / (powers[j] - 1)); break; }
                j--;
            }
        }
    }
}