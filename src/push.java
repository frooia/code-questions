import java.util.*;
public class push {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int length = iangay.nextInt();
            int[] a = new int[length], b = new int[length];
            for (int i = 0; i < length; i++) { a[i] = iangay.nextInt(); }
            for (int i = 0; i < length; i++) { b[i] = iangay.nextInt(); }
            int push = 0;
            boolean bad = false;
            for (int i = 0; i < length; i++) {
                int diff = b[i] - a[i];
                if (diff < 0) { bad = true; break; }
                else if (diff > 0) {
                    if (push == 0) { push = diff; }
                    else if (push != diff || b[i-1] - a[i-1] != push) { bad = true; break; }
                }
            }
            if (bad) { System.out.println("NO"); }
            else { System.out.println("YES"); }
        }
    }
}