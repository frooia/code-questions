import java.util.*;
import java.io.*;
public class snooze {
    private static long snoozetime(long[] ex, long l) {
        long total = 0;
        for (int i = 0; i < ex.length - 1; i++) {
            if (ex[i] + l < ex[i+1]) total += l;
        }
        return total;
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            long dl = fs.nextLong();
            long[] ex = new long[n], naps = new long[n-1];
            for (int i = 0; i < n; i++) ex[i] = fs.nextLong();
            Arrays.sort(ex);
            long snooze = 0;
            for (int i = 1; i < n; i++) naps[i-1] = ex[i] - ex[i-1] - 1;
            Arrays.sort(naps);
            for (int i = 0; i < n-1; i++) snooze = Math.max(snooze, naps[i] * (n - 1 - i));
            /*
            long low = 0, high = dl;
            for (int i = 0; i < 100; i++) {
                long first = (high - low) / 3 + low, second = high - (high - low) / 3;
                long s1 = snoozetime(ex, first), s2 = snoozetime(ex, second);
                if (s1 < s2) low = first;
                else high = second;
                snooze = (low + high) / 2;
//                out.println(low+" "+high);
            }
             */
            out.println(snooze);
//            out.println(snoozetime(ex, snooze));
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