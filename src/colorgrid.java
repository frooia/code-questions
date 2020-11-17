import java.util.*;
import java.io.*;
public class colorgrid {
    static final int[] NR = {1, 0, 0, -1};
    static final int[] NC = {0, 1, -1, 0};
    private static boolean good(int[][] g, boolean[][] visited, int x, int y) {
        return (x >= 0) && (y >= 0) && (x < g.length) && (y < g[0].length) && (!visited[x][y]);
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), m = fs.nextInt();
            int[][] g = new int[n][m];
            HashMap<Integer, HashSet<pair>> colors = new HashMap<>();
            HashMap<Integer, Boolean> vC = new HashMap<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    g[i][j] = fs.nextInt();
                    if (!colors.containsKey(g[i][j])) {
                        colors.put(g[i][j], new HashSet<>());
                        vC.put(g[i][j], false);
                    }
                    colors.get(g[i][j]).add(new pair(i, j));
                }
            }
//            out.println(colors.toString());

            // BFS
            int[][] level = new int[n][m];
            for (int[] x : level) Arrays.fill(x, -1);
            boolean[][] visited = new boolean[n][m];
            LinkedList<pair> q = new LinkedList<>();
            visited[0][0] = true;
            level[0][0] = 0;
            q.add(new pair(0,0));
            while (!q.isEmpty()) {
                pair v = q.poll();
                if (v.equals(new pair(n - 1, m - 1))) break;
                for (int i = 0; i < 4; i++) {
                    if (good(g, visited, v.k+NR[i], v.v+NC[i])) {
                        visited[v.k+NR[i]][v.v+NC[i]] = true;
                        level[v.k+NR[i]][v.v+NC[i]] = level[v.k][v.v] + 1;
                        q.add(new pair(v.k+NR[i], v.v+NC[i]));
                    }
                }
                if (!vC.get(g[v.k][v.v])) {
                    for (pair p : colors.get(g[v.k][v.v])) {
                        if (good(g, visited, p.k, p.v)) {
                            visited[p.k][p.v] = true;
                            level[p.k][p.v] = level[v.k][v.v] + 1;
                            q.add(p);
                        }
                    }
                }
                vC.put(g[v.k][v.v], true);
            }
            out.println(level[n-1][m-1]);
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
    static class pair implements Comparable<pair> {
        int k, v;
        pair(int k, int v) {
            this.k = k;
            this.v = v;
        }
        public int compareTo(pair o2) {
            if (this.k != o2.k)
                return this.k - o2.k;
            return this.v - o2.v;
        }
        public String toString() {
            return "("+k+", "+v+")";
        }
    }
}