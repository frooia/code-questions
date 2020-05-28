import java.util.*;
public class game23 {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int n = iangay.nextInt();
        int m = iangay.nextInt();
        boolean end = false;
        if (m % n != 0) { end = true; }
        int div = m / n; int ops = 0;
        while (!end) {
            if (div%2 == 0) { div /= 2; ops++; }
            else if (div%3 == 0) { div /= 3; ops++; }
            if (div%2 != 0 && div%3 != 0) { end = true; }
        }
        if (m%n != 0 || div != 1) { System.out.println(-1); }
        else { System.out.println(ops); }
    }
}