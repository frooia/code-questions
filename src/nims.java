import java.util.*;
import java.io.*;
public class nims {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), num1s = 0;
            int[] a = new int[n];
            boolean init = true;
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
                if (a[i] == 1 && init) num1s++;
                if (a[i] != 1) init = false;
            }
            if ((num1s == n && num1s % 2 == 0) || (num1s < n && num1s % 2 == 1)) out.println("Second");
            else out.println("First");
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