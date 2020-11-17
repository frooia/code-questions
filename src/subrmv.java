import java.util.*;
import java.io.*;
public class subrmv {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            char[] a = fs.next().toCharArray();
            int[] c = new int[a.length];
            int num1 = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == '0') num1 = 0;
                else num1++;
                if ((i < a.length-1 && a[i+1] == '0') || (i == a.length-1 && a[i] == '1')) c[i] = num1;
                else c[i] = 0;
            }
            Arrays.sort(c);
            int score = 0;
            for (int i = a.length-1; i >= 0; i-=2) {
                score += c[i];
            }
            out.println(score);
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