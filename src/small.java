import java.util.*;
import java.io.*;
public class small {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) a.add(fs.nextInt());
            /*
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = fs.nextInt();
             */
            Collections.sort(a);
            int index = 0;
            while (index < a.size() - 1) {
                if (Math.abs(a.get(index) - a.get(index + 1)) <= 1) {
                    int rmv;
                    if (a.get(index) > a.get(index + 1)) rmv = index + 1;
                    else rmv = index;
                    a.remove(rmv);
                } else index++;
//                out.println(a.toString());
//                out.println(index);
            }
            if (a.size() > 1) out.println("NO");
            else out.println("YES");
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
    }
}