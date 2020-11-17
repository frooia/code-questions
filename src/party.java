import java.util.*;
import java.io.*;
public class party {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt();
        int[] g = new int[1000010];
        for (int i = 0; i < n; i++) {
            int size = fs.nextInt(), start = fs.nextInt(), end = fs.nextInt();
            g[start] += size;
            g[end] -= size;
        }
        int max = 0, curr = 0;
        for (int value : g) {
            curr += value;
            if (curr > max) max = curr;
        }
        out.println(max);
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