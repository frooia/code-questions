import java.util.*;
import java.io.*;
public class cobbledstreets {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int p = fs.nextInt(), b = fs.nextInt(), s = fs.nextInt();
            long ans = 0;
            int[][] e = new int[s][3]; // from to weight
            for (int i = 0; i < s; i++) {
                e[i][0] = fs.nextInt();
                e[i][1] = fs.nextInt();
                e[i][2] = fs.nextInt();
            }
            Arrays.sort(e, new Comparator<int[]>() {
                @Override
                public int compare(int[] ints, int[] t1) {
                    return ints[2] - t1[2];
                }
            });
            DSU dsu = new DSU(b);
            for (int i = 0; i < s; i++) {
                if (dsu.find(e[i][0] - 1) != dsu.find(e[i][1] - 1)) {
                    ans += e[i][2];
                    dsu.union(e[i][0] - 1, e[i][1] - 1);
                }
            }
            out.println(ans * p);
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