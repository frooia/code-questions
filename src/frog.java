import java.util.*;
public class frog {
    private static int max3nums(int a, int b, int c) {
        if (a >= b) { return Math.max(a, c); }
        else { return Math.max(b, c); }
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt(), m = iangay.nextInt();
            int[][] a = new int[n][m], best = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = iangay.nextInt();
                    if (i == 0 && j == 0)
                        best[i][j] = 0;
                    else if (i == 0)
                        best[i][j] = best[i][j-1] + a[i][j];
                    else if (j == 0)
                        best[i][j] = best[i-1][j] + a[i][j];
                    else
                        best[i][j] = max3nums(best[i][j-1] + a[i][j], best[i-1][j] + a[i][j], best[i-1][j-1] + a[i][j] * 2);
                }
            }
            System.out.println(best[n-1][m-1]);
        }
    }
}