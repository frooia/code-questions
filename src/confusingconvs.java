import java.util.*;
import java.io.*;
public class confusingconvs {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            String f = fs.next();
            if (f.equals("formatHeight")) {
                int x = fs.nextInt(); int y = fs.nextInt();
                out.println(x + "'" + y + "\"");
            }
            else if (f.equals("formatDate")) {
                int y = fs.nextInt(); int m = fs.nextInt(); int d = fs.nextInt();
                out.print(y);
                if (m < 10) out.print("0" + m);
                else out.print(m);
                if (d < 10) out.print("0" + d);
                else out.print(d);
                out.println();
            }
            else {
                String[] x = fs.nextLine().split(" ");
                for (int i = 0; i < x.length; i++) {
                    if (!x[i].equals("")) {
                        out.print(x[i]);
                        if (i < x.length - 1) out.print(",");
                    }
                }
                out.println();
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