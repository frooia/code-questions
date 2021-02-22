import java.util.*;
import java.io.*;
public class bitormiss {
    private static long choose(int n, int k) {
        if (n == k || k == 0) { return 1; }
        else { return choose(n-1, k - 1) + choose(n-1, k); }
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = fs.nextInt(), h = fs.nextInt();
        long ans = choose(N, h);
        int count = 0;
        while (ans%2 == 0) {
            ans /= 2;
            count++;
        }
        out.println(ans + "/" + (int)Math.pow(2, N - count));
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