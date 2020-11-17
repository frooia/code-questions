import java.util.*;
public class flip {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt(), neg = 0, pos = 0, zero = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = iangay.nextInt();
                if (i > 0) {
                    int diff = a[i] - a[i - 1];
                    if (diff == 0) { zero++; }
                    else if (diff > 0) { pos++; }
                    else { neg++; }
                }
            }
            while (neg != pos) {
                for (int i = 1; i < n - 1; i++) {
                    int d1 = a[i] - a[i - 1], d2 = a[i + 1] - a[i];
                    if (neg < pos && d1 >= 0 && d2 >= 0 && !(d1 == 0 && d2 == 0)) {
                        a[i] = -1 * a[i];
                        neg++;
                        if (d1 == 0 || d2 == 0) { zero--; }
                        else { pos--; }
                    }
                    else if (neg > pos && d1 <= 0 && d2 <= 0 && !(d1 == 0 && d2 == 0)) {
                        a[i] = -1 * a[i];
                        pos++;
                        if (d1 == 0 || d2 == 0) { zero--; }
                        else { neg--; }
                    }
                }
            }
        }
    }
}