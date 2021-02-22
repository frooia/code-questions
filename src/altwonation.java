import java.util.*;
import java.io.*;
public class altwonation {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        char[] s = fs.next().toCharArray();
        boolean[] sb = new boolean[s.length];
        int maxL = 1;
        for (int i = 0; i < s.length; i++) {
            sb[i] = s[i] == '1';
        }
        boolean curr = sb[0];
        for (int i = 1; i < sb.length; i++) {
            if (sb[i] == !curr) { maxL++; curr = !curr; }
        }
        /*
        for (int i = 1; i < s.length; i++) {
            if (sb[i] != sb[i-1]) currL++;
            else currL = 1;
            if (currL > maxL) maxL = currL;
        }*/
        out.println(maxL);
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