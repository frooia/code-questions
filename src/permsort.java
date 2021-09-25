import java.util.*;
import java.io.*;
public class permsort {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            int[] a = new int[n];
            boolean inorder = true;
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
                if (a[i] != (i+1))
                    inorder = false;
            }
            boolean fl = a[n-1] == 1, ff = a[0] == 1, lf = a[0] == n, ll = a[n-1] == n;
            if (inorder)
                out.println(0);
            else if (fl && lf)
                out.println(3);
            else if (fl ^ lf)
                out.println(2);
            else if (ff || ll)
                out.println(1);
            else
                out.println(2);
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