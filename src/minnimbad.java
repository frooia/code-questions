import java.util.*;
import java.io.*;
public class minnimbad {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = fs.nextInt();
            boolean isSim = true, simShift1 = true, allSame = true, sameShift1 = true, simExcept1 = true;
            for (int i = 0; i < n; i++) {
                if (b[i] != b[n-i-1]) isSim = false;
                if (i > 0) {
                    if (b[i] != b[n - i]) simShift1 = false;
                    if (b[i] != b[i - 1]) allSame = false;
                    if (i < n-1 && b[i] != b[i+1]) sameShift1 = false;
                    if (b[i] != b[n-i-1]) simExcept1 = false;
                }
            }
            if (allSame) { // 2 2 2
                if (n%2 == 0) out.println("Bob");
                else out.println("Alice");
            }
            else if (isSim) { // 2 1 2
                out.println("Bob");
            }
            else if (sameShift1) {
                if (b[0] > b[1]) out.println("Alice"); // 3 2 2 2
                else if ((n-1)%2 == 0) out.println("Alice");
                else out.println("Bob"); // 1 2 2 2
            }
            else if (simShift1) { // 4 3 1 2 1 3
                out.println("Alice");
            }
            else if (simExcept1) {
                if (b[0] > b[n-1]) out.println("Alice");
                else out.println("Bob");
            }
            else out.println("Bob");
            out.println(simShift1);
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