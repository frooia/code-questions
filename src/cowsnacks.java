import java.util.*;
import java.io.*;
public class cowsnacks {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int s = fs.nextInt(), g = fs.nextInt();
        DSU dsu = new DSU(s);
        int sad = 0;
        for (int i = 0; i < g; i++) {
            int x = fs.nextInt()-1, y = fs.nextInt()-1;
            if (dsu.size[dsu.find(x)] > 1 && dsu.size[dsu.find(y)] > 1) {
                sad++;
                break;
            } else dsu.union(x, y);
        }
        out.println(sad);
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
        int find(int v) { // average time O(inverse Ackermann function, basically constant)
            if (parent[v] == v) return v;
            return parent[v] = find(parent[v]);
        }
        void union(int a, int b) { // average time same as find()
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

}