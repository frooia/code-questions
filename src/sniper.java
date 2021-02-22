import java.util.*;
import java.io.*;
public class sniper {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), k = fs.nextInt();
            int[] ps = new int[n+1]; ps[0] = 0;
            long th = 0;
            for (int i = 0; i < n; i++) {
                long h = fs.nextLong();
                if (h > 0) ps[i+1] = ps[i] + 1;
                else ps[i+1] = ps[i] - 1;
                th += h;
            }
            for (int i = 0; i < k; i++) {
                int b = fs.nextInt();
                if (ps[b] > 0) th += ps[b];
            }
            out.println(th);
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