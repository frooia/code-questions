import java.util.*;
import java.io.*;
public class bonobiu2 {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt(), m = fs.nextInt(), sx = fs.nextInt(), sy = fs.nextInt();
        boolean left = false;
        for (int i = sy; i < m+1; i++) out.println(sx+" "+i);
        for (int i = sy-1; i >= 1; i--) out.println(sx+" "+i);
        for (int i = sx-1; i >= 1; i--) {
            if (!left) { for (int j = 1; j < m+1; j++) out.println(i+" "+j);}
            else { for(int j = m; j >= 1; j--) out.println(i+" "+j); }
            left = !left;
        }
        for (int i = sx+1; i < n+1; i++) {
            if (!left) { for (int j = 1; j < m+1; j++) out.println(i+" "+j); }
            else { for(int j = m; j >= 1; j--) out.println(i+" "+j); }
            left = !left;
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