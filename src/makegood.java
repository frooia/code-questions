import java.util.*;
import java.io.*;
public class makegood {
    private static boolean good(int[] a, int index) {
        boolean maxReached = false;
        for (int i = index + 1; i < a.length - 1; i++) {
            if (a[i] > a[i+1] && !maxReached) maxReached = true;
            else if (a[i] < a[i+1] && maxReached) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = fs.nextInt();
            int low = 0, high = n;
            if (good(a, -1)) out.println(0);
            else {
                int p;
                while (true) {
                    int mid = (low + high) / 2;
                    if (good(a, mid)) high = mid;
                    else low = mid + 1;
//                    out.println(low + " " + mid + " " + high);
                    if (low >= high) {
                        p = (low + high) / 2;
                        break;
                    }
                }
                out.println(p + 1);
            }
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