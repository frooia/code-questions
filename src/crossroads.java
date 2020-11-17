import java.util.*;
import java.io.*;
public class crossroads {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        boolean[][] lanes = new boolean[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (fs.nextInt() == 1)
                    lanes[i][j] = true;
            }
        }
        boolean bad = false;
        for (int i = 0; i < 4; i++) {
            if (lanes[i][3] && (lanes[i][0] || lanes[i][1] || lanes[i][2] || lanes[(i+3)%4][2] || lanes[(i+1)%4][0] || lanes[(i+2)%4][1])) {
                bad = true;
                break;
            }
        }
        if (bad) out.println("YES");
        else out.println("NO");
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