import java.util.*;
import java.io.*;
public class vasya5 {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), s = fs.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = fs.nextInt();
            int max = 0, i = 0, sub = 0;
            long sum = 0;
            boolean busted = false;
            while (i < n) {
                sum += v[i];
                if (v[i] > v[max]) max = i;
                if (sum > s) {
                    if (!busted) {
                        busted = true;
                        sub = max;
                        sum -= v[max];
                    }
                    else break;
                }
                i++;
            }
//            out.print(sum+" ");
            if (i == n && !busted) out.println(0);
            else out.println(sub+1);
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