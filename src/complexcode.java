import java.util.*;
import java.io.*;
public class complexcode {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), maxc = fs.nextInt(), maxn = fs.nextInt();
            int nest = 0, cyc = 1, nestMax = -1;
            boolean isCyc = false;
            char[] code = new char[n];
            for (int i = 0; i < n; i++) {
                String s = fs.nextLine();
                if (s.substring(0, 1).equals("P")) code[i] = 'p'; // print
                else if (s.substring(0, 1).equals("I")) code[i] = 'i'; // if
                else if (s.substring(0, 1).equals("E")) code[i] = 'e'; // else
                else if (s.substring(0, 1).equals("{")) code[i] = 'o'; // open {
                else code[i] = 'c'; // close }

                if (code[i] == 'o') nest++;
                else if (code[i] == 'c') nest--;
                if (nest > nestMax) nestMax = nest;

                if (code[i] == 'i') cyc++;
            }
            out.print(cyc + " " + nestMax);
            if (cyc <= maxc && nestMax <= maxn) out.println(" PASS");
            else out.println(" FAIL");
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