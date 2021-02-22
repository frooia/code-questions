import java.util.*;
import java.io.*;
public class radio {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        for (int m = 0; m < tc; m++) {
            out.println("Day #"+(m+1)+":");
            int n = fs.nextInt(),
                    pn = fs.nextInt(),
                    q = fs.nextInt();
            double[] s = new double[n];
            ArrayList<Double> s2 = new ArrayList<>();
            int[] p = new int[pn];
            HashSet<Double> presets = new HashSet<>();
            for (int i = 0; i < n; i++) { s[i] = fs.nextDouble(); s2.add(s[i]); }
            for (int i = 0; i < pn; i++) {
                double x = fs.nextDouble();
                presets.add(x);
                p[i] = s2.indexOf(x);
            }
            for (int i = 0; i < q; i++) {
                double sfrom = fs.nextDouble(), sto = fs.nextDouble();
                int from = s2.indexOf(sfrom), to = s2.indexOf(sto);
//                out.println(from+" "+to);
                int min1 = Math.min(Math.abs(from - to), n - Math.abs(from - to));
                int ans = min1;
//                out.println(min1+" min1");
                for (int j = 0; j < min1; j++) {
//                    out.println(s[(to-j+n)%n]+" "+s[(to+j+n)%n]);
                    if (presets.contains(s[(to-j+n)%n]) || presets.contains(s[(to+j+n)%n])) {
                        ans = j + 1; break;
                    }
                }
                out.println(ans);
            }
//            out.println(presets.toString());
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