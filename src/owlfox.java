import java.util.*;
import java.io.*;
class owlfox {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            char[] in = fs.next().toCharArray();
            for (int i = in.length - 1; i >= 0; i--) {
                if (in[i] != '0') {
                    in[i] -= 1;
                    break;
                }
            }
            boolean hasPrinted = false;
            for (int i = 0; i < in.length; i++) {
                if (in[i] != '0') {
                    hasPrinted = true;
                }
                if (hasPrinted) {
                    out.print(in[i]);
                }
            }
            if (!hasPrinted) {
                out.print(0);
            }
            out.println();
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