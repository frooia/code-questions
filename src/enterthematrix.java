import java.util.*;
import java.io.*;
public class enterthematrix {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            double[][] c = new double[2][2];
            int[] f = new int[2];
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++)
                    c[i][j] = fs.nextInt();
            f[0] = fs.nextInt(); f[1] = fs.nextInt();
            double[][] ic = new double[2][2];
            double det = c[0][0] * c[1][1] - c[1][0] * c[0][1];
            ic[0][0] = c[1][1] / det;
            ic[0][1] = - c[0][1] / det;
            ic[1][0] = - c[1][0] / det;
            ic[1][1] = c[0][0] / det;
            double[] e = new double[2];
            e[0] = f[0]*ic[0][0] + f[1]*ic[1][0];
            e[1] = f[0]*ic[0][1] + f[1]*ic[1][1];
            for (int i = 0; i < 2; i++)
                out.print(round(e[i]) + " ");
            out.println();
//            out.println(det);
        }
        out.close();
    }
    static int round(double x) {
        if (x == 0) return 0;
        else if (x > 0) {
            if (x - Math.floor(x) < 0.5) return (int) Math.floor(x);
            return (int) Math.ceil(x);
        }
        if (x - Math.floor(x) <= 0.5) return (int) Math.floor(x);
        return (int) Math.ceil(x);
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