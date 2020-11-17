import java.util.*;
public class divide {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            long n = iangay.nextLong(), moves = 0;
            while (n%2 == 0 || n%3 == 0 || n%5 == 0) {
                if (n%2 == 0) { n /= 2; }
                else if (n%3 == 0) { n /= 3; n *= 2; }
                else { n /= 5; n *= 4; }
                moves++;
            }
            if (n == 1) { System.out.println(moves); }
            else { System.out.println(-1); }
        }
    }
}