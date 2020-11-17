import java.util.*;
public class swamp {
    private static int[] cn = {0, 1, -1, 0};
    private static int[] rn = {-1, 0, 0, 1};
    private static boolean isSafe(char[][] swamp, boolean[][] visited, int x, int y) {
        return (x >= 0) && (x < swamp.length) && (y >= 0) && (y < swamp[0].length) && !visited[x][y] && swamp[x][y] == 'R';
    }
    private static void dfs(char[][] swamp, boolean[][] visited, int[][] islands, int x, int y, int count) {
        visited[x][y] = true;
        islands[x][y] = count;
        for (int i = 0; i < 4; i++) {
            if (isSafe(swamp, visited, x + rn[i], y + cn[i])) {
                dfs(swamp, visited, islands, x + rn[i], y + cn[i], count);
            }
        }
    }
    private static void dfsIterative(char[][] swamp, boolean[][] visited, int[][] islands, int x, int y, int count) {
        Stack<pair> s = new Stack<>();
        s.push(new pair(x, y));
        visited[x][y] = true;
        islands[x][y] = count;
        while (!s.empty()) {
            pair v = s.pop();
            for (int i = 0; i < 4; i++) {
                if (isSafe(swamp, visited, v.k + rn[i], v.v + cn[i])) {
                    s.push(new pair(v.k + rn[i], v.v + cn[i]));
                    visited[v.k + rn[i]][v.v + cn[i]] = true;
                    islands[v.k + rn[i]][v.v + cn[i]] = count;
                }
            }
        }
    }
    private static void countIslands(char[][] swamp, int[][] islands) {
        boolean[][] visited = new boolean[swamp.length][swamp[0].length];
        int count = 0;
        for (int i = 0; i < swamp.length; i++) {
            for (int j = 0; j < swamp[0].length; j++) {
                if (swamp[i][j] == 'R' && !visited[i][j]) {
                    dfsIterative(swamp, visited, islands, i, j, count);
                    count++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt(), m = iangay.nextInt(), t = iangay.nextInt();
            char[][] swamp = new char[n][m];
            int[][] islands = new int[n][m];
            for (int i = 0; i < n; i++) {
                swamp[i] = iangay.next().toCharArray();
                for (int j = 0; j < m; j++) { islands[i][j] = -1; }
            }
            countIslands(swamp, islands);
            while (t --> 0) {
                int x1 = iangay.nextInt()-1, y1 = iangay.nextInt()-1, x2 = iangay.nextInt()-1, y2 = iangay.nextInt()-1;
                if (islands[x1][y1] > -1 && islands[x2][y2] > -1 && islands[x1][y1] == islands[x2][y2]) { System.out.println("safe"); }
                else { System.out.println("alligator"); }
            }
        }
    }
}