import java.util.*;
import java.io.*;
public class suburban {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            long x = fs.nextLong();
            double c = 0;
            long i;
            long min = Integer.MAX_VALUE;
            for (i = (long)Math.sqrt(x/2.0); i >= 0; i--) {
                c = Math.sqrt(x-i*i);
                if (c == (long)c) min = Math.min(min, (long)(c+i));
            }
//            out.println(i+" "+c);
            if (min < Integer.MAX_VALUE) out.println(min);
            else out.println(-1);
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