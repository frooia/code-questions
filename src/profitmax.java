import java.util.*;
import java.io.*;
public class profitmax {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) p[i] = fs.nextInt() - fs.nextInt();
//        out.println(Arrays.toString(p));
        long msf = 0, meh = 0;
        for (int i = 0; i < n; i++) {
            meh += p[i];
            if (meh > msf) msf = meh;
//            out.println(meh+" "+msf);
            if (meh < 0) meh = 0;
        }
        out.println(msf);
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