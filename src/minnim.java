import java.util.*;
import java.io.*;
public class minnim {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = fs.nextInt();
            int mismatch = 0, i = 0, j = n-1;
            if (n%2 == 0) {
                while (i <= j) {
                    if (b[i] != b[j]) mismatch++;
                    i++; j--;
                }
                if (mismatch == 1) out.println("Alice");
                else out.println("Bob");
            }
            else {
                boolean good = false;
                while (i <= j) {
                    if (b[i] != b[j]) {
                        boolean good1 = true;
                        int x = i, y = j;
                        while (i < j) {
                            if (b[i] != b[j-1]) {
                                good1 = false; break;
                            }
                            i++; j--;
                        }
                        i = x; j = y;
                        boolean good2 = true;
                        while (i < j) {
                            if (b[i+1] != b[j]) {
                                good2 = false; break;
                            }
                            i++; j--;
                        }
                        good = good1 || good2; break;
                    }
                    good = true; i++; j--;
                }
                if (good) out.println("Alice");
                else out.println("Bob");
            }
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