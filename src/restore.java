import java.util.*;
import java.io.*;
public class restore {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int l = fs.nextInt();
            boolean[] visited = new boolean[l];
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < 2*l; i++) {
                int x = fs.nextInt();
                if (!visited[x-1]) {
                    visited[x-1] = true;
                    arr.add(x);
                }
            }
            for (int i : arr) out.print(i + " ");
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