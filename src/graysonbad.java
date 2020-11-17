import java.util.*;
import java.io.*;
public class graysonbad {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int w = fs.nextInt(), n = fs.nextInt();
            HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
            graph g = new graph(n, n*(n-1)/2);
            for (int i = 0; i < n; i++) m.put(i, new ArrayList<>(Arrays.asList(fs.nextInt(), fs.nextInt(), fs.nextInt())));
            int curr = 0;
            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    g.edges[curr].from = i;
                    g.edges[curr].to = j;
                    g.edges[curr].weight = Math.sqrt(Math.pow(m.get(i).get(2), 2) + Math.pow(m.get(j).get(2), 2));
                }
            }
        }
        out.close();
    }
    static class graph {
        static class edge implements Comparable<edge> {
            int from, to;
            double weight;
            @Override
            public int compareTo(edge o) {
                return Double.compare(this.weight, o.weight);
            }
        }
        static class sub{
            int parent, rank;
        }
        int V, E;
        edge[] edges;
        graph(int v, int e) {
            V = v;
            E = e;
            edges = new edge[E];
            for (int i = 0; i < e; i++) edges[i] = new edge();
        }
        int find(sub[] s, int i) {
            if (s[i].parent == i) return i;
            return s[i].parent = find(s, s[i].parent);
        }
        void union(sub[] s, int a, int b) {
            int aroot = find(s, a), broot = find(s, b);
            if (aroot == broot) return;
            if (s[aroot].rank < s[broot].rank) s[aroot].parent = broot;
            else if (s[aroot].rank > s[broot].rank) s[broot].parent = aroot;
            else {
                s[broot].parent = aroot;
                s[aroot].rank++;
            }
        }
        void mst(int w) {
            edge[] result = new edge[V];
            boolean[] used = new boolean[edges.length];
            int e = 0, i = 0;
            Arrays.sort(edges);
            sub[] s = new sub[V];
            for (int j = 0; j < V; j++) {
                result[j] = new edge();
                s[j] = new sub();
                s[j].rank = 0;
                s[j].parent = j;
            }
            while (e < V-1) {
                int fits;
                edge curredge;
                if (!used[i]) curredge = edges[i++];
                else { i++; continue; }
                int x = find(s, curredge.from), y = find(s, curredge.to);
                if (x != y) {
                    result[e++] = curredge;
                    union(s, x, y);
                }
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