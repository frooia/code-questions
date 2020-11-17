import java.util.*;
import java.io.*;
public class giftfix {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            ArrayList<Integer> a = new ArrayList<>(), b = new ArrayList<>();
            for (int i = 0; i < n; i++) a.add(fs.nextInt());
            for (int i = 0; i < n; i++) b.add(fs.nextInt());
            int minA = Collections.min(a), minB = Collections.min(b);
            long m = 0;
            for (int i = 0; i < n; i++) {
                m += Math.max(a.get(i) - minA, b.get(i) - minB);
            }
            out.println(m);
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