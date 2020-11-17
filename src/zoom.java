import java.util.*;
import java.io.*;
public class zoom {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            TreeMap<String, Integer> tm = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                String in = fs.next();
                if (tm.containsKey(in)) tm.put(in, tm.get(in) + 1);
                else tm.put(in, 1);
            }
            ArrayList<pairzoom> arr = new ArrayList<>();
            for (String k : tm.keySet()) arr.add(new pairzoom(k, tm.get(k)));
            arr.sort((pairzoom::compareTo));
            for (pairzoom x : arr) out.println(x.k);
            out.flush();
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
    static class sortcomparator implements Comparator<pairzoom> {
        @Override
        public int compare(pairzoom o1, pairzoom o2) {
            return o1.compareTo(o2);
        }
    }
}
class pairzoom {
    String k;
    int v;
    pairzoom(String k, int v) {
        this.k = k;
        this.v = v;
    }
    int compareTo(pairzoom o2) {
        if (this.v == o2.v)
            return this.k.compareTo(o2.k);
        return o2.v - this.v;
    }
}