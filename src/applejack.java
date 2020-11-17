import java.util.*;
import java.io.*;
public class applejack {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        int tc = fs.nextInt();
//        while (tc --> 0) {
            int n = fs.nextInt();
            HashSet<Integer> has2 = new HashSet<>();
            TreeSet<Integer> has4 = new TreeSet<>();
            HashMap<Integer, Integer> c = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = fs.nextInt();
                if (!c.containsKey(x)) c.put(x, 0);
                c.put(x, c.get(x) + 1);
                if (c.get(x) >= 4) has4.add(x);
                if (c.get(x) >= 2) has2.add(x);
            }
            int q = fs.nextInt();
            for (int i = 0; i < q; i++) {
                String s = fs.next(); int x = fs.nextInt();
                if (s.equals("+")) {
                    if (!c.containsKey(x)) c.put(x, 0);
                    c.put(x, c.get(x) + 1);
                    if (c.get(x) >= 4) has4.add(x);
                    if (c.get(x) >= 2) has2.add(x);
                }
                else {
                    c.put(x, c.get(x) - 1);
                    if (has4.contains(x) && c.get(x) < 4) has4.remove(x);
                    if (has2.contains(x) && c.get(x) < 2) has2.remove(x);
                    if (c.get(x) == 0) c.remove(x);
                }
//                out.println((i+1)+": "+c.toString());
                if (has4.isEmpty()) out.println("NO");
                else if (has4.size() > 1 ||
                        (has2.size() > 2) ||
                        (c.get(has4.first()) >= 6 && has2.size() > 1) ||
                        (c.get(has4.first()) >= 8))
                    out.println("YES");
                else out.println("NO");
            }
//        }
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