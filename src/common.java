import java.net.Inet4Address;
import java.util.*;
import java.io.*;
public class common {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int la = fs.nextInt(), lb = fs.nextInt();
            int[] a = new int[la], b = new int[lb];
            HashSet<Integer> nums = new HashSet<>();
            boolean found = false;
            int samenum = -1;
            for (int i = 0; i < la; i++) {
                a[i] = fs.nextInt();
                nums.add(a[i]);
            }
            for (int i = 0; i < lb; i++) {
                b[i] = fs.nextInt();
                if (nums.contains(b[i])) {
                    samenum = b[i];
                    found = true;
                }
            }
            if (found) out.println("YES\n1 "+ samenum);
            else out.println("NO");
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