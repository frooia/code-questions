import java.util.*;
import java.io.*;
public class expectations {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            int[] s = new int[n];
            long ans = 0;
            s[0] = fs.nextInt();
            for (int i = 1; i < n; i++) {
                s[i] = fs.nextInt();
                if (s[i] <= s[i-1]) {
                    ans += s[i - 1] - s[i] + 1;
                    s[i] = s[i-1] + 1;
                }
            }
            out.println(ans);
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