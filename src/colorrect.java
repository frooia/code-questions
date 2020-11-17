import java.util.*;
import java.io.*;
public class colorrect {
    private static int max3nums(int a, int b, int c) {
        if (a >= b) { return Math.max(a, c); }
        else { return Math.max(b, c); }
    }
    private static int min3nums(int a, int b, int c) {
        if (a <= b) { return Math.min(a, c); }
        else { return Math.min(b, c); }
    }
    private static int mid3nums(int a, int b, int c) {
        int[] n = {a, b, c};
        Arrays.sort(n);
        return n[1];
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int rl = fs.nextInt(), gl = fs.nextInt(), bl = fs.nextInt();
        int[] r = fs.nextIntArray(rl), g = fs.nextIntArray(gl), b = fs.nextIntArray(bl);
        Arrays.sort(r); Arrays.sort(g); Arrays.sort(b);
        out.println(Arrays.toString(r));
        out.println(Arrays.toString(g));
        out.println(Arrays.toString(b));
        int ri = rl-1, gi = gl-1, bi = bl-1;
        long total = 0;
        while ((ri > -1 && gi > -1) || (ri > -1 && bi > -1) || (gi > -1 && bi > -1)) {
//            out.println(total);
            if (ri > -1 && gi > -1 && bi > -1) {
                total += max3nums(r[ri], g[gi], b[bi]) * mid3nums(r[ri], g[gi], b[bi]);
//                out.println(r[ri]+" "+g[gi]+" "+b[bi]+" "+min3nums(r[ri], g[gi], b[bi]));
                if (min3nums(r[ri], g[gi], b[bi]) == r[ri]) { gi--; bi--; }
                else if (min3nums(r[ri], g[gi], b[bi]) == g[gi]) { ri--; bi--; }
                else { ri--; gi--; }
            }
            else if (ri == -1) { total += g[gi] * b[bi]; gi--; bi--; }
            else if (gi == -1) { total += r[ri] * b[bi]; ri--; bi--; }
            else { total += r[ri] * g[gi]; ri--; gi--; }
        }
        out.println(total);
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
        int[] nextIntArray(int size) {
            int[] a = new int[size];
            for (int i = 0; i < size; i++) a[i] = nextInt();
            return a;
        }
    }
}