import java.util.*;
public class bogosort {
    private static int choose(int n, int k) {
        if (n == k || k == 0) { return 1; }
        else { return choose(n-1, k - 1) + choose(n-1, k); }
    }
    private static boolean isGood(int[] a) {
        for (int j = 0; j < a.length-1; j++) {
            for (int k = j+1; k < a.length; k++) {
                if (j - a[j] == k - a[k]) {
                    int temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = in.nextInt();
            int[] a = new int[length];
            for (int j = 0; j < length; j++) { a[j] = in.nextInt(); }
            boolean good = false;
            while (!good) {
                good = isGood(a);
            }
            for (int n : a) { System.out.print(n + " "); }
        }
    }
}
