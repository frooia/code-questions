import java.io.*;
import java.util.*;
public class booksez2 {
    public static void main(String[] args) {
        FastScanner iangay = new FastScanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int kids = iangay.nextInt();
            int[] books = new int[kids];
            for (int j = 0; j < kids; j++) {
                books[j] = iangay.nextInt() - 1;
            }
            DSU dsu = new DSU(kids);
            for (int j = 0; j < kids; j++) {
                dsu.union(j, books[j]);
            }
            for (int j = 0; j < kids; j++) {
                System.out.print(dsu.size[dsu.find(books[j])]+" ");
            }
            System.out.println();
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
