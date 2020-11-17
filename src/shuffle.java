import java.util.*;
public class shuffle {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int length = iangay.nextInt(), x = iangay.nextInt()-1, operations = iangay.nextInt();
            int c = x, d = x;
            for (int i = 0; i < operations; i++) {
                int l = iangay.nextInt()-1, r = iangay.nextInt()-1;
                if ((c >= l && c <= r) || (d >= l && d <= r)) {
                    if (l < c) { c = l; }
                    if (r > d) { d = r; }
                }
            }
            System.out.println(d - c + 1);
        }
    }
}