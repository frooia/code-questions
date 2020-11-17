import java.util.*;
import java.io.*;
public class boboniu {
    private static int max3nums(int a, int b, int c) {
        if (a >= b) { return Math.max(a, c); }
        else { return Math.max(b, c); }
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            long[] c = {fs.nextLong(), fs.nextLong(), fs.nextLong()};
            Arrays.sort(c);
            long w = fs.nextLong();
            long[] mods = {c[0]%2, c[1]%2, c[2]%2};
            int odds = 0;
            for (int i = 0; i < c.length; i++) {
                if (mods[i] == 1) odds++;
            }
            if (w%2 == 1) odds++;
            if (odds < 2) out.println("Yes");
            else if (c[0] > 0) {
                odds = 0;
                w += 3;
                c[1] -= 1;
                c[2] -= 1;
                c[0] -= 1;
                for (int i = 0; i < c.length; i++) {
                    mods[i] = c[i] % 2;
                    if (mods[i] == 1) odds++;
                }
                if (w % 2 == 1) odds++;
                if (odds > 1) out.println("No");
                else out.println("Yes");
            }
            else out.println("No");
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