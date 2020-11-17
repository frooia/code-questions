import java.util.*;
import java.io.*;
public class languages2 {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt(), m = fs.nextInt();
        int[] a = new int[n+m];
        DSU dsu = new DSU(n+m, n);
        for (int i = 0; i < n; i++) {
            int l = fs.nextInt();
            for (int j = 0; j < l; j++) {
                int lang = fs.nextInt() + n - 1;
                dsu.union(lang, i);
            }
        }
        int cost = 0;
        int max = n;
        for (int i = n; i < n+m; i++) { if (dsu.size[i] > dsu.size[max]) max = i; }
        if (dsu.all0()) {
            cost = n;
        } else {
            for (int i = 0; i < n; i++) {
                if (dsu.find(i) != dsu.find(max)) {
                    cost++;
                    dsu.union(i, max);
                }
            }
        }
        out.println(cost);
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
        static int N, split;
        int[] parent, rank, size;
        DSU(int n, int s) {
            N = n;
            split = s;
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
            if (a >= split && b >= split) { // both langs
                if (rank[a] < rank[b]) {
                    parent[a] = b;
                    size[b] += size[a];
                } else {
                    parent[b] = a;
                    size[a] += size[b];
                    if (rank[a] == rank[b]) rank[a]++;
                }
            }
            else if (a >= split) { // a is lang, b is not
                parent[b] = a;
                size[a]++;
            }
            else if (b >= split) { // b is lang, a is not
                parent[a] = b;
                size[b]++;
            }
        }
        boolean all0() {
            for (int i = 0; i < N; i++) {
                if (parent[i] != i) return false;
            }
            return true;
        }
    }
}