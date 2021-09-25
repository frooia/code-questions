import java.util.*;
import java.io.*;
public class polynomial {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            // input
            String[] s1 = fs.nextLine().split(" ");
            String[] s2 = fs.nextLine().split(" ");
            int[] p1 = new int[s1.length];
            int[] p2 = new int[s2.length];
            int[] ans = new int[s1.length + s2.length - 1];
            for (int i = 0; i < s1.length; i++) {
                if (s1[i].length() == 1) p1[i] = Integer.parseInt(s1[i]);
                else p1[i] = -1 * Integer.parseInt(s1[i].substring(1));
            }
            for (int i = 0; i < s2.length; i++) {
                if (s2[i].length() == 1) p2[i] = Integer.parseInt(s2[i]);
                else p2[i] = -1 * Integer.parseInt(s2[i].substring(1));
            }
            // calculation
            for (int i = 0; i < s1.length; i++) {
                for (int j = 0; j < s2.length; j++) {
                    ans[i+j] += p1[i] * p2[j];
                }
            }
            // printing
            boolean hasPrinted = false;
            for (int i = 0; i < ans.length; i++) {
                if (ans[i] != 0) {
                    if (ans[i] == 1) {
                        if (i == 0) out.print(1);
                        else if (i == 1) out.print("+x");
                        else out.print("+x^" + i);
                        hasPrinted = true;
                    }
                    else if (ans[i] == -1) {
                        if (i == 0) out.print(-1);
                        else if (i == 1) out.print("-x");
                        else out.print("-x^"+i);
                        hasPrinted = true;
                    }
                    else {
                        String toPrint = "";
                        if (hasPrinted && ans[i] > 0) toPrint += "+";
                        toPrint += ans[i];
                        if (i == 1) toPrint += "x";
                        else if (i > 1) toPrint += "x^" + i;
                        hasPrinted = true;
                        out.print(toPrint);
                    }
                }
            }
            if (!hasPrinted) out.print(0);
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