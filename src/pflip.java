import java.util.*;
import java.io.*;
public class pflip {
    static ArrayList<Boolean> flip(ArrayList<Boolean> a, int index) {
        ArrayList<Boolean> b = new ArrayList<>();
        for (int i = index; i >= 0; i--) b.add(!a.get(i));
        if (index < a.size()-1) b.addAll(a.subList(index+1, a.size()));
        return b;
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            ArrayList<Boolean> from = new ArrayList<>(), to = new ArrayList<>();
            char[] a = fs.next().toCharArray(), b = fs.next().toCharArray();
            for (int i = 0; i < n; i++) {
                from.add(a[i] != '0');
                to.add(b[i] != '0');
            }
            ArrayList<Integer> ops = new ArrayList<>();
            for (int i = 0; i < n-1; i++) {
                if (from.get(i) != from.get(i+1)) {
                    ops.add(i);
                }
            }
            if (from.get(n-1) != to.get(n-1)) ops.add(n-1);
            ArrayList<Integer> backwards = new ArrayList<>();
            for (int i = 0; i < n-1; i++) {
                if (to.get(i) != to.get(i+1)) backwards.add(i);
            }
            for (int i = backwards.size()-1; i >= 0; i--) ops.add(backwards.get(i));
            /*
            for (int i = n-1; i >= 0; i--) {
                if (from.get(i) != to.get(i)) {
                    if (to.get(i) == from.get(0)) {
                        int firstNon = 0;
                        for (int j = 0; j < i+1; j++) {
                            if (from.get(j) == to.get(i)) {
                                firstNon = j;
                                break;
                            }
                        }
                        flip(from, firstNon);
                        ops.add(firstNon);
                    }
                    else {
                        flip(from, 0);
                        ops.add(0);
                    }
                    flip(from, i);
                    ops.add(i);
                }
            }
             */
            out.print(ops.size());
            for (int i : ops) out.print(" "+(i+1));
            out.println();
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