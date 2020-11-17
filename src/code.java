import java.util.*;
import java.io.*;
public class code {
    static int f(int[] tokens, long lineLength) {
        long line = 0, linemax = 0;
        int i = 0, numLines = 0;
        while (i < tokens.length) {
            if (line == 0) {
                line += tokens[i];
                i++;
            } else if (line + tokens[i] < lineLength) {
                line += tokens[i] + 1;
                i++;
            } else {
                line = 0;
                numLines++;
            }
            if (line > linemax) linemax = line;
        }
        return numLines;
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            // Input
            int maxL = fs.nextInt(), n = fs.nextInt();
            int[] t = new int[n];
            long low = 0, high = n - 1;
            for (int i = 0; i < n; i++) {
                t[i] = fs.nextInt();
                if (t[i] > low) low = t[i];
                high += t[i];
            }
            // Binary search
            long m = high;
            for (int i = 0; i < 50; i++) {
                long mid = (low + high + 1) / 2;
                int linemax = f(t, mid);
//                out.println(low+" "+mid+" "+high);
//                out.println(linemax);
                if (linemax > maxL) high = mid - 1;
                else low = mid;
//                if (linemax < m && linemax != -1) m = linemax;
                m = linemax;
                if (i == 49) {
                    long line = 0;
                    for (int value : t) {
                        if (line + value < linemax) {
                            out.print(value + " ");
                            line += value;
                        } else {
                            out.print("\n" + value + " ");
                            line = 0;
                        }
                    }
                }
            }
            out.println();
            out.println(m+" final");
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