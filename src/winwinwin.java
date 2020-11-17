import java.util.*;
import java.io.*;
public class winwinwin {
    static int maxW;
    static int[][] trees; // eh wh el wl
    static int perms(int[] perm, int k, boolean[] used, int eSum) {
        for (int i = 0; i < 2; i++) {
            if (!used[i]) {
                used[i] = true;
                eSum += trees[k][i*2];
                maxW = Math.max(perms(perm, k+1, used, eSum), maxW);
                used[i] = false;
            }
        }
        return maxW;
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), maxE = fs.nextInt();
            trees = new int[n][4];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < 4; j++) trees[i][j] = fs.nextInt();
            maxW = 0;

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