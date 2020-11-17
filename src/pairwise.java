import java.util.*;
import java.io.*;
public class pairwise {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int x = fs.nextInt(), y = fs.nextInt(), z = fs.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(x, y, z));
            Collections.sort(arr);
            if (!arr.get(2).equals(arr.get(1))) out.println("NO");
            else {
                out.println("YES");
                out.println(arr.get(0)+" "+arr.get(0)+" "+arr.get(2));
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