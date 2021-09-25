import java.util.*;
import java.io.*;
public class maxmex {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), k = fs.nextInt();
            int[] a = new int[n];
            TreeSet<Integer> ts = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
                ts.add(a[i]);
            }
            Iterator<Integer> iter = ts.iterator();
            int count = 0, max = ts.last(), mex = max + 1;
            while (iter.hasNext()) {
                int x = iter.next();
                if (x != count) {
                    if (x != ts.first()) mex = count;
                    else mex = 0;
                    break;
                }
                count++;
            }
            // out.println("mex = " + mex + " and max = " + max);
            if (mex == max + 1)
                out.println(ts.size() + k);
            else if (k == 0 || ts.contains((int)Math.ceil((mex + max) / 2.0)))
                out.println(ts.size());
            else
                out.println(ts.size() + 1);
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