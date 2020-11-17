import java.util.*;
import java.io.*;
public class mootube {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt(), q = fs.nextInt();
        HashMap<Integer, HashMap<Integer, Integer>> g = new HashMap<>();
        for (int i = 0; i < n-1; i++) {
            int from = fs.nextInt(), to = fs.nextInt(), r = fs.nextInt();
            if (!g.containsKey(from)) g.put(from, new HashMap<>());
            if (!g.containsKey(to)) g.put(to, new HashMap<>());
            g.get(from).put(to, r);
            g.get(to).put(from, r);
        }
        while (q --> 0) {
            int k = fs.nextInt(), v = fs.nextInt();

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