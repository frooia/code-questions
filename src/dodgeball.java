import java.util.*;
import java.io.*;
public class dodgeball {
    private static int mindiff;
    private static int maxdiff(int[] a, int[][] vals) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < a.length; i+=2) {
            ts.add(vals[a[i]][a[i+1]]);
        }
        return ts.last() - ts.first();
    }
    private static void perms(int[] perm, boolean[] used, int k, int[][] vals) {
        if (k == perm.length / 2) {
            for (int i : perm) System.out.print(i);
            System.out.println();
//            System.out.println(maxdiff(perm, vals));
            mindiff = Math.min(mindiff, maxdiff(perm, vals));
            return;
        }
        int x = 0;
        for (int i = 0; i < perm.length; i++) { if (perm[i] == -1) { x = i; break; } }
        for (int i = x+1; i < perm.length; i++) {
            if (perm[i] == -1) {
                System.out.println(i);
                used[i] = true;
                perm[x] = i;
                perm[i] = x;
                perms(perm, used, k+1, vals);
                perm[x] = -1;
                perm[i] = -1;
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            int[][] vals = new int[2*n][2*n];
            int[] p = new int[2*n];
            for (int i = 0; i < 2*n; i++) {
                p[i] = -1;
                for (int j = 0; j < 2 * n; j++)
                    vals[i][j] = fs.nextInt();
            }
            mindiff = Integer.MAX_VALUE;
            perms(p, new boolean[2*n], 0, vals);
            out.println(mindiff);
            out.flush();
        }
        out.close();
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream i) { br = new BufferedReader(new InputStreamReader(i)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}