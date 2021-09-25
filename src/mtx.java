import java.util.*;
import java.io.*;
public class mtx {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            long payMax = -1, freeMax = -1;
            // boolean hasPay = false, hasFree = false;
            for (int i = 0; i < n; i++) {
                long s = fs.nextLong(), m = fs.nextLong();
                long p = s * (1000 + m);
                if (m == 0) {
                    // if (!hasFree) hasFree = true;
                    if (p > freeMax)
                        freeMax = p;
                }
                else {
                    // if (!hasPay) hasPay = true;
                    if (p > payMax)
                        payMax = p;
                }
            }
            // out.println(payMax + " " + freeMax);
            if (freeMax > payMax) out.println("YES");
            else out.println("NO");
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