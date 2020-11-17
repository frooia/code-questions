import java.util.*;
import java.io.*;
public class weather {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), d = fs.nextInt();
            int[] rd = new int[n];
            for (int i = 0; i < n; i++) rd[i] = fs.nextInt();
            int buckets = d / n;
            if (d%n != 0) buckets++;
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    int need = (rd[i]-1) / i;
                    if ((rd[i]-1) % i != 0) need++;
//                    out.println(need);
                    if (need > buckets) {
                        buckets = need;
                    }
                }
            }
            out.println(buckets);
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