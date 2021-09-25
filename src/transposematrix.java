import java.util.*;
import java.io.*;
public class transposematrix {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int c = fs.nextInt(), r = fs.nextInt();
            String[][] m = new String[r][c];
            for (int i = 0; i < c; i++) {
                String[] s = fs.next().split(",");
                for (int j = 0; j < r; j++) {
                    m[j][i] = s[j];
                }
            }
            for (String[] strings : m) {
                for (int j = 0; j < m[0].length; j++) {
                    if (j < m[0].length - 1)
                        out.print(strings[j]);
                }
                out.println();
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