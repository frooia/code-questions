import java.util.*;
import java.io.*;
class cobbledstreets2 {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            // Input
            int p = fs.nextInt(), b = fs.nextInt(), s = fs.nextInt();
            int[][] g = new int[b][b];
            for (int i = 0; i < s; i++) {
                int f = fs.nextInt() - 1, t = fs.nextInt() - 1, w = fs.nextInt();
                g[f][t] = w;
                g[t][f] = w;
            }

            int sum = 0;
            PriorityQueue<Edge> pq = new PriorityQueue<>();
            for (int i = 0; i < b; i++)
                if (g[0][i] > 0)
                    pq.add(new Edge(0, i, g[0][i]));
            boolean[] v = new boolean[b];

            v[0] = true;
            while (!pq.isEmpty()) {
                Edge e = pq.poll();
                if (v[e.to]) continue;
                v[e.to] = true;
                sum += e.weight;
                for (int i = 0; i < b; i++)
                    if (g[e.to][i] > 0)
                        pq.add(new Edge(e.to, i, g[e.to][i]));
            }
            out.println(sum * p);
        }
        out.close();
    }
    static class Edge implements Comparable<Edge> {
        int from, to, weight;
        Edge (int f, int t, int w) {
            from = f;
            to = t;
            weight = w;
        }
        @Override
        public int compareTo(Edge edge) {
            return weight - edge.weight;
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