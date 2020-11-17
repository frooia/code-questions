import java.util.*;
import java.io.*;
public class trade {
    private static void dfs(HashMap<Integer, HashSet<Integer>> g, boolean[] visited, int[] vals, int v, long max) {
        Stack<Integer> s = new Stack<>();
        s.push(v);
        visited[v-1] = true;
        while (!s.isEmpty()) {
            int x = s.pop();
            if (g.containsKey(x)) {
                for (int y : g.get(x)) {
                    if (!visited[y - 1]) {
                        s.push(y);
                        visited[y - 1] = true;
                        max = Math.max(max, vals[y - 1]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt(), s = fs.nextInt();
            int[] sv = new int[s];
            for (int i = 0; i < s; i++) sv[i] = fs.nextInt();
            HashMap<Integer, HashSet<Integer>> g = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int k = fs.nextInt(), l = fs.nextInt();
                for (int j = 0; j < l; j++) {
                    int p = fs.nextInt();
                    if (!g.containsKey(p)) g.put(p, new HashSet<>());
                    g.get(p).add(k);
                }
            }
            out.println(g.toString());
            long max = -1;
            dfs(g, new boolean[s], sv, 1, max);
            out.println(max+" ok");
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
}