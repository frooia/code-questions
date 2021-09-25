import java.util.*;
import java.io.*;
public class phonenum {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            String[] s = fs.next().split("");
            String f = fs.next();
            if (f.equals("PARENTHESES")) {
                out.println("("+s[0]+s[1]+s[2]+") "+s[3]+s[4]+s[5]+"-"+s[6]+s[7]+s[8]+s[9]);
            }
            else if (f.equals("DASHES")) {
                out.println(s[0]+s[1]+s[2]+"-"+s[3]+s[4]+s[5]+"-"+s[6]+s[7]+s[8]+s[9]);
            }
            else {
                out.println(s[0]+s[1]+s[2]+"."+s[3]+s[4]+s[5]+"."+s[6]+s[7]+s[8]+s[9]);
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