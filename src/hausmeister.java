import java.util.*;
import java.io.*;
public class hausmeister {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int f = fs.nextInt(), r = fs.nextInt()+2;
        char[][] a = new char[f][r];
        int[] c = new int[f];
        for (int i = 0; i < f; i++) a[i] = fs.next().toCharArray();
        for (int i = 0; i < f; i++) {
            c[i] = 0;
            for (int j = 0; j < r; j++) {
                if (a[i][j] == '1') c[i]++;
            }
        }
        int cost = 0;
        boolean isLeft = true, canChoose = false;
        int choose1 = -1, choose2 = -1;
        for (int i = 0; i < f; i++) {
            if (c[i] > 0) {
                int first1 = 0, last1 = 0;
                for (int j = 1; j < r-1; j++) {
                    if (first1 == 0 && a[i][j] == '1') first1 = j;
                    if (a[i][j] == '1') last1 = j;
                }
                if (canChoose) {

                    canChoose = false;
                    choose1 = -1;
                    choose2 = -1;
                }
                else if (isLeft && last1 < r / 2) cost += last1 * 2;
                else if (!isLeft && first1 > r / 2) cost += (r - 1 - first1) * 2;
                else  {
                    canChoose = true;
                    choose1 = c[i];
                    if (isLeft) choose2 = last1 * 2;
                    else choose2 = (r - 1 - first1) * 2;
                    isLeft = !isLeft;
                }
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