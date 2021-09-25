import java.util.*;
import java.io.*;
public class circularrotation {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = fs.nextLong(), k = fs.nextLong() % n, q = fs.nextLong();
        long[] a = new long[(int)n];
        for (int i = 0; i < n; i++)
            a[i] = fs.nextInt();

        for (int i = 0; i < q; i++) {
            int x = fs.nextInt();
            out.println(a[(int)((x - k + n) % n)]);
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