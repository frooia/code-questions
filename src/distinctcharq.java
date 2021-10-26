import java.util.*;
import java.io.*;
public class distinctcharq {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        char[] s = fs.next().toCharArray();
        int q = fs.nextInt();
        while (q --> 0) {
            int t = fs.nextInt();
            if (t == 1) {
                int pos = fs.nextInt();
                char n = fs.next().toCharArray()[0];
                s[pos - 1] = n;
            } else {
                int l = fs.nextInt(), r = fs.nextInt();
                HashSet<Character> hs = new HashSet<>();
                for (int i = l - 1; i < r; i++)
                    hs.add(s[i]);
                out.println(hs.size());
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