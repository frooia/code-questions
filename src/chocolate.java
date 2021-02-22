import java.util.*;
import java.io.*;
public class chocolate {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), k = fs.nextInt();
            int[] pos = new int[k], neg = new int[k];
            for (int i = 0; i < k; i++) {
                pos[i] = fs.nextInt()-1;
                neg[i] = fs.nextInt();
            }
            Arrays.sort(pos); Arrays.sort(neg);
//            out.println(Arrays.toString(pos));
//            out.println(Arrays.toString(neg));
            HashMap<Integer, Integer> posmap = new HashMap<>(), negmap = new HashMap<>();
            for (int po : pos) {
                if (posmap.containsKey(po)) posmap.put(po, posmap.get(po) + 1);
                else posmap.put(po, 1);
            }
            for (int ne : neg) {
                if (negmap.containsKey(ne)) negmap.put(ne, negmap.get(ne) + 1);
                else negmap.put(ne, 1);
            }
            int cp = 0, cn = 0, ans = 0; long curr = 0, prev = 0;
            for (int i = 0; i < n; i++) {
                if (cp < pos.length && pos[cp] == i) { curr += posmap.get(i); cp += posmap.get(i); }
                if (cn < neg.length && neg[cn] == i) { curr -= negmap.get(i); cn += negmap.get(i); }
                if (curr > prev) { ans += curr - prev; }
//                out.println(curr);
                prev = curr;
            }
            out.println(ans);
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