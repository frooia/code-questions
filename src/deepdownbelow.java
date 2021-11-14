import java.util.*;
import java.io.*;
class deepdownbelow {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            ArrayList<ArrayList<Integer>> c = new ArrayList<>();
            pair[] minP = new pair[n];
            for (int i = 0; i < n; i++) {
                int k = fs.nextInt();
                long initP = 0;
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j < k; j++) {
                    int d = fs.nextInt();
                    if (j == 0) {
                        initP = d + 1;
                    }
                    else {
                        if (initP + j - d < 1) {
                            initP += d - 1 - temp.get(j - 1);
                        }
                    }
                    temp.add(d);
                }
                minP[i] = new pair(initP, i);
                c.add(temp);
            }

            for (int i = 0; i < minP.length; i++) {
//                out.println(minP[i]);
            }
//            out.println();
            Arrays.sort(minP);
            for (int i = 0; i < minP.length; i++) {
//                out.println(minP[i]);
            }
//            out.println();

            int sumSize = 0;
            for (int i = 0; i < minP.length; i++) {
                minP[i].k -= sumSize;
                sumSize += c.get(minP[i].v).size();
//                out.println(minP[i]);
            }
            long max = Integer.MIN_VALUE;
            for (pair j : minP) {
//                out.println(j);
                if (j.k > max)
                    max = j.k;
            }
            out.println(max);
        }
        out.close();
    }
    static class pair implements Comparable<pair> {
        long k;
        int v;
        pair(long k, int v) {
            this.k = k;
            this.v = v;
        }
        @Override
        public int compareTo(pair o) {
            return (int)(this.k - o.k);
        }
        public String toString() {
            return "("+k+", "+v+")";
        }
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