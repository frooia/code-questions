import java.util.*;
import java.io.*;
public class practice {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int a = fs.nextInt(), b = fs.nextInt(), r = fs.nextInt();
            double low = 0, high = 2.3*Math.pow(10, 7), t = 0;
            for (int i = 0; i < 200; i++) {;
                double mid = (low + high) / 2;
//                out.println(mid);
                double val = a + b * (Math.sqrt(mid + 1) - Math.cbrt(mid + 1));
                if (val > r) high = mid;
                else low = mid;
                t = (low + high) / 2;
                if (low > high) break;
            }
            out.println(t);
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