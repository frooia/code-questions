import java.util.*;
import java.io.*;
public class manhattan {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt(), xh = fs.nextInt(), yh = fs.nextInt(), xw = fs.nextInt(), yw = fs.nextInt();
        int[][] e = new int[n][2];
        int[][] end = new int[n][2];
        int count = 0, d = Math.abs(xh-xw) + Math.abs(yh-yw);

        for (int i = 0; i < n; i++) {
            int x = fs.nextInt(), y = fs.nextInt();
            if ((x > xh && xh > xw) || (x < xh && xh < xw) || (y > yh && yh > yw) || (y < yh && yh < yw)) {
                e[i][0] = -1;
                e[i][1] = -1;
            } else {
                e[i][0] = x;
                e[i][1] = y;
            }
        }

        for (int i = 0; i < n; i++) {
            if (e[i][0] == -1) continue;
            int l = 0, r = count;
            while (l <= r) {
                int m = (l + r) / 2;
            }
        }

        out.close();
    }
    static int findDist(int x1, int y1, int x2, int y2) {
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
    static boolean onMyWay(int xh, int yh, int xw, int yw, int x, int y) {
        return (x > xh && xh > xw) || (x < xh && xh < xw) || (y > yh && yh > yw) || (y < yh && yh < yw);
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