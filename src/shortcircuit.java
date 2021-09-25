import java.util.*;
import java.io.*;
import java.lang.*;
public class shortcircuit {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = fs.nextInt();
        char[][] grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            grid[i] = fs.next().toCharArray();
        }
        // if (bfs(grid, N)) {
        if (dfstool(grid, N)) {
            out.println("Yes");
        }
        else {
            out.println("No");
        }
        out.close();
    }
    static final int[][] COORDS = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    /*
    private static boolean bfs(char[][] grid, int N) {
        boolean[][] visited = new boolean[N][N];
        LinkedList<ArrayList<Integer>> q = new LinkedList<>();
        visited[0][0] = true;
        q.add(new ArrayList<>(Arrays.asList(0, 0)));
        while (q.size() != 0) {
            ArrayList<Integer> s = q.poll();
            if (grid[s.get(0)][s.get(1)] == 'G') {
                return true;
            }
            else if (grid[s.get(0)][s.get(1)] == '1' || grid[s.get(0)][s.get(1)] == 'S') {

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if ((X[i] == 0 && (Y[j] == 1 || Y[j] == -1)) || (Y[j] == 0 && (X[i] == -1 || X[i] == 1)) &&
                                (s.get(0) + X[i] >= 0 && s.get(0) + X[i] < N && s.get(1) + Y[j] >= 0 && s.get(1) + Y[j] < N) &&
                                !visited[s.get(0) + X[i]][s.get(1) + Y[j]]) {
                            q.add(new ArrayList<>(Arrays.asList(s.get(0) + X[i], s.get(1) + Y[j])));
                        }
                    }
                }
                for (int i = 0; i < 4; i++) {
                    int x = COORDS[i][0];
                    int y = COORDS[i][1];
                    if ((s.get(0) + x >= 0 && s.get(0) + x < N && s.get(1) + y >= 0 && s.get(1) + y < N) && !visited[s.get(0) + x][s.get(1) + y]) {
                        q.add(new ArrayList<>(Arrays.asList(s.get(0) + x, s.get(1) + y)));
                    }
                }
            }
            visited[s.get(0)][s.get(1)] = true;
        }
        return false;
    }
    */
    static boolean good = false;
    private static boolean dfs(int[] v, int N, boolean[][] visited, char[][] grid) {
//        System.out.println(v[0] + " " + v[1]);
        visited[v[0]][v[1]] = true;
        if (good || grid[v[0]][v[1]] == 'G') {
            good = true;
            return true;
        }
        else if (grid[v[0]][v[1]] == '1' || grid[v[0]][v[1]] == 'S') {
            for (int i = 0; i < 4; i++) {
                int x = COORDS[i][0];
                int y = COORDS[i][1];
                if ((v[0] + x >= 0 && v[0] + x < N && v[1] + y >= 0 && v[1] + y < N) && !visited[v[0] + x][v[1] + y]) {
                    dfs(new int[]{v[0] + x, v[1] + y}, N, visited, grid);
                }
            }
        }
        return false;
    }
    private static boolean dfstool(char[][] grid, int N) {
        boolean[][] visited = new boolean[N][N];
        dfs(new int[]{0, 0}, N, visited, grid);
        return good;
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
