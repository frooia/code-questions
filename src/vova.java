import java.util.*;
import java.io.*;
class vova {
    static int[] prices;
    static ArrayList<HashSet<Integer>> arr;
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt(), e = fs.nextInt();
        prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = fs.nextInt();
        }

        arr = new ArrayList<>(n);
        for (int i = 0; i < e; i++) {
            int a = fs.nextInt() - 1, b = fs.nextInt() - 1;
            arr.get(a).add(b);
            arr.get(b).add(a);
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