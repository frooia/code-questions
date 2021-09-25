import java.util.*;
import java.io.*;
public class triangles {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            int[] s = new int[n];
            TreeSet<Integer> ts = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                s[i] = fs.nextInt();
                ts.add(s[i]);
            }
            Arrays.sort(s);
            int acute = 0, right = 0, obtuse = 0;
            for (int i = n-1; i >= 0; i--) {
                for (int j = i - 1; j > 0; j--) {
                    double p = Math.sqrt(s[i] * s[i] - (double)(s[j] * s[j]));
                    if (s[j] + s[j-1] > s[i]) {
                        if (p > s[j]) {
                            int ob = ts.headSet(s[i] - s[j], true).size(); // #s that are too small to work
			    
                        }
                        int ob = 0;
                        obtuse += ob;
                        acute += s[j] - ob;
                    }
                    if (p == (int)p && ts.contains((int)p) && p != s[j]) {
                        right++;
                        obtuse--;
                    }
                }
            }
            out.println(acute+" "+right+" "+obtuse);
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
