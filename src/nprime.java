import java.util.*;
import java.io.*;
public class nprime {
    private static ArrayList<Integer> PRIMES;
    private static HashSet<Integer> NP;
    private static void init(int n) {
        boolean[] p = new boolean[n + 1];
        Arrays.fill(p, true);
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (p[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    p[j] = false;
                }
            }
        }
        PRIMES = new ArrayList<>();
        for (int i = 2; i < p.length; i++) {
            if (p[i] && i < Math.sqrt(n) + 1) PRIMES.add(i);
        }
        NP = new HashSet<>();
        for (int i = 0; i < PRIMES.size(); i++) {
            for (int j = i; j < PRIMES.size(); j++) {

            }
        }
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        init((int)Math.pow(10, 5));
        out.println(PRIMES.toString());
        out.println(PRIMES.size());
        while (tc --> 0) {

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