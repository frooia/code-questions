import java.util.*;
public class energy {
    private static int max3nums(int a, int b, int c) {
        if (a >= b) { return Math.max(a, c); }
        else { return Math.max(b, c); }
    }
    private static int solve(int[] a, int[] solved, int i) {
        if (i >= a.length) { return 0; }
        if (i > a.length - 4) { return a[i]; }
        if (solved[i+3] == -1) { solved[i+3] = solve(a, solved, i+3); }
        if (i > a.length - 5 && solved[i+4] == -1) { solved[i+4] = solve(a, solved, i+4); }
        if (i > a.length - 6 && solved[i+5] == -1) { solved[i+5] = solve(a, solved, i+5); }
        int i3 = solved[i+3], i4 = solved[i+4], i5 = solved[i+5];
        if (i < 0) { return max3nums(i3, i4, i5); }
        return a[i] + max3nums(i3, i4, i5);
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt();
            int[] a = new int[n], solved = new int[n];
            for (int i = 0; i < n; i++) { a[i] = iangay.nextInt(); solved[i] = -1; }

            for (int i = 0; i < n; i++) {
                if (i < 3) {
                    solved[i] = a[i];
                }
                else {
                    solved[i] = Math.max(solved[i - 1], solved[i - 3] + a[i]);
                }
            }
//            System.out.println(solve(a, solved, -3));
            if (n == 0) { System.out.println(0); }
            else if (n > 3) { System.out.println(max3nums(solved[n - 1], solved[n-2], solved[n-3])); }
            else {
                Arrays.sort(solved);
                System.out.println(solved[n - 1]);
            }
        }
    }
}