import java.util.*;
import java.io.*;
public class gstring {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            char[] s = fs.next().toCharArray();
            int[][] seq = new int[10][10];
            int max = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    boolean second = false;
                    for (char c : s) {
                        if (!second && c == '0' + i) {
                            second = true;
                            seq[i][j]++;
                        } else if (second && c == '0' + j) {
                            second = false;
                            seq[i][j]++;
                        }
                    }
                    if (second && i != j) seq[i][j]--;
                    if (seq[i][j] > max) max = seq[i][j];
                }
            }
//            out.println(Arrays.deepToString(seq));
            out.println(s.length - max);
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