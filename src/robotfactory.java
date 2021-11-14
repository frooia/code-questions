import java.util.*;
import java.io.*;
class robotfactory {
    private static final int[] cn = {0, 1, -1, 0};
    private static final int[] rn = {-1, 0, 0, 1};
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt(), m = fs.nextInt();
        char[][][] g = new char[n][m][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String b = Integer.toBinaryString(fs.nextInt());
                for (int k = 0; k < 4 - b.length(); k++) {
                    g[i][j][k] = '0';
                }
                for (int k = 4 - b.length(); k < 4; k++) {
                    g[i][j][k] = b.charAt(k + b.length() - 4);
                }
            }
        }

        boolean[][] visited = new boolean[n][m];
        ArrayList<Integer> sizes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j]) continue;
                visited[i][j] = true;
                sizes.add(dfsIterative(g, visited, i, j));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                out.print(Arrays.toString(g[i][j]));
                out.print("   ");
            }
            out.println();
        }
        Collections.sort(sizes);
        Collections.reverse(sizes);
        for (int i : sizes) {
            out.print(i + " ");
        }
        out.println();
        out.close();
    }
    private static int dfsIterative(char[][][] g, boolean[][] visited, int x, int y) {
        System.out.println("dfs!");
        Stack<pair> s = new Stack<>();
        s.push(new pair(x, y));
        visited[x][y] = true;
        int size = 0;
        while (!s.empty()) {
            pair v = s.pop();
            System.out.println("(" + v.k + ", " + v.v + ") " + Arrays.toString(g[v.k][v.v]));
            size++;
            for (int i = 0; i < 4; i++) {
                int c;
                if (i == 0) { c = 2;}
                else if (i == 1) { c = 1; }
                else if (i == 2) { c = 3; }
                else { c = 0; }
                System.out.println(g[v.k][v.v][c]);
                if (g[v.k][v.v][c] == '0' && isSafe(g, visited, v.k + rn[i], v.v + cn[i])) {
                    s.push(new pair(v.k + rn[i], v.v + cn[i]));
                    visited[v.k + rn[i]][v.v + cn[i]] = true;
                }
            }
        }
        return size;
    }
    private static boolean isSafe(char[][][] g, boolean[][] visited, int x, int y) {
        System.out.println((x >= 0) && (x < g.length) && (y >= 0) && (y < g[0].length) && !visited[x][y]);
        return (x >= 0) && (x < g.length) && (y >= 0) && (y < g[0].length) && !visited[x][y];
    }
    static class pair implements Comparable<pair> {
        int k, v;
        pair(int k, int v) {
            this.k = k;
            this.v = v;
        }
        @Override
        public int compareTo(pair o) {
            if (this.k != o.k)
                return this.k - o.k;
            return this.v - o.v;
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