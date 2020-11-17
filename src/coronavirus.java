import java.util.*;
import java.io.*;
public class coronavirus {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), m = fs.nextInt(), q = fs.nextInt();
            DSU dsu = new DSU(n);
            ArrayList<pair> r = new ArrayList<>();
            for (int i = 0; i < m; i++) r.add(new pair(fs.nextInt()-1, fs.nextInt()-1));
            LinkedList<pair> s = new LinkedList<>();
            for (int i = 0; i < q; i++) s.add(new pair(fs.nextInt(), fs.nextInt() - 1));
            ArrayList<Integer> ans = new ArrayList<>();
//            out.println(r.toString());
//            out.println(s.toString());
            boolean[] remEdges = new boolean[m];
            for (pair p : s) {
                if (p.k == 1) remEdges[p.v] = true;
            }
//            out.println(Arrays.toString(remEdges));
            for (int i = 0; i < m; i++) {
                if (!remEdges[i]) dsu.union(r.get(i).k, r.get(i).v);
            }
            while (s.size() != 0) {
                pair curr = s.pollLast();
//                out.println(curr.toString());
//                out.println(Arrays.toString(dsu.parent));
//                out.println(Arrays.toString(dsu.size));
                assert curr != null;
                if (curr.k == 1) {
                    dsu.union(r.get(curr.v).k, r.get(curr.v).v);
                }
                else {
                    ans.add(dsu.size[dsu.find(curr.v)]);
                }
            }
            for (int i = ans.size() - 1; i >= 0; i--) out.println(ans.get(i));
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
    static class DSU {
        int N;
        int[] parent, rank, size;
        DSU(int n) {
            N = n;
            parent = new int[N];
            rank = new int[N];
            size = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                rank[i] = 1;
                size[i] = 1;
            }
        }
        int find(int v) { // average time O(logn)
            if (parent[v] == v) return v;
            return parent[v] = find(parent[v]);
        }
        void union(int a, int b) { // average time O(logn)
            a = find(a); b = find(b);
            if (a == b) return;
            if (rank[a] < rank[b])  {
                parent[a] = b;
                size[b] += size[a];
            }
            else {
                parent[b] = a;
                size[a] += size[b];
                if (rank[a] == rank[b]) rank[a]++;
            }
        }
    }
    static class pair {
        int k, v;
        pair(int k, int v) {
            this.k = k;
            this.v = v;
        }
        int compareTo(pair o2) {
            if (this.k != o2.k)
                return this.k - o2.k;
            return this.v - o2.v;
        }
        @Override
        public String toString() {
            return "("+this.k+", "+this.v+")";
        }
    }
}