import java.util.*;
import java.io.*;
public class algebra {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            long a1 = fs.nextInt(), b1 = fs.nextInt(), d1 = fs.nextInt();
            long a2 = fs.nextInt(), b2 = fs.nextInt(), d2 = fs.nextInt();
            int l = fs.nextInt(), h = fs.nextInt();
            long x = (d1 * b2 - d2 * b1) / (a1 * b2 - a2 * b1);
            long y = (a1 * d2 - a2 * d1) / (a1 * b2 - a2 * b1);
            out.println(x+" "+y);
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