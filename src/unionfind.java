import java.util.*;
import java.io.*;
public class unionfind {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt(), q = fs.nextInt();
        DSU dsu = new DSU(n);
        for (int i = 0; i < q; i++) {
            if (fs.next().equals("=")) {
                int a = fs.nextInt(), b = fs.nextInt();
                dsu.union(a, b);
            }
            else {
                int a = fs.nextInt(), b = fs.nextInt();
                if (dsu.find(a) == dsu.find(b)) out.println("yes");
                else out.println("no");
            }
        }
        out.close();
    }
    static class DSU {
        int N;
        int[] parent, rank;
        DSU(int n) {
            N = n;
            parent = new int[N];
            rank = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                rank[i] = 1;
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
            }
            else {
                parent[b] = a;
                if (rank[a] == rank[b]) rank[a]++;
            }
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