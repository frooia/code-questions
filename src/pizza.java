import java.util.*;
import java.io.*;
public class pizza {
    private static long fastmod(long b, long e, long m) {
        if (e == 0) return 1;
        if (e == 1) return b%m;
        long t = fastmod(b, e / 2, m);
        t = (t * t) % m;
        if (e%2 == 0) return t;
        return ((b%m) * t) % m;
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            long t = fs.nextLong(), m = fs.nextLong();
            out.println((fastmod(2, t-1, m) * (fastmod(2, t, m) + 1)) % m);
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