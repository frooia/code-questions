import java.util.*;
import java.io.*;
public class binimum {
    private static String toBinary(int n) {
        StringBuilder ans = new StringBuilder();
        int count = (int)(Math.log(n) / Math.log(2));
        while (count >= 0) {
            if (n >= Math.pow(2, count)) {
                ans.append(1);
                n %= Math.pow(2, count);
            }
            else ans.append(0);
            count--;
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt();
        String s = toBinary(n);
        int ans = s.length() - 2;
        for (char c : s.toCharArray())
            if (c == '1') ans++;
        out.println(ans);
        //int rows = (int)(Math.log(n) / Math.log(2));
        //out.println(bfs(rows+1, n+1, n));
        out.close();
    }
    private static int bfs(int rows, int cols, int target) {
        boolean[][] visited = new boolean[rows][cols];
        int[][] vals = new int[rows][cols];
        int[][] paths = new int[rows][cols];
        LinkedList<ArrayList<Integer>> q = new LinkedList<>();
        visited[0][0] = true;
        vals[0][0] = 1;
        paths[0][0] = 0;
        q.add(new ArrayList<>(Arrays.asList(0, 0)));
        while (q.size() != 0) {
            ArrayList<Integer> s = q.poll();
            if (s.get(0) < rows - 1 && !visited[s.get(0) + 1][s.get(1)]) {
                visited[s.get(0) + 1][s.get(1)] = true;
                vals[s.get(0) + 1][s.get(1)] = vals[s.get(0)][s.get(1)] * 2;
                paths[s.get(0) + 1][s.get(1)] = paths[s.get(0)][s.get(1)] + 1;
                System.out.println(s.get(0) + 1 + " " + s.get(1) + " " + vals[s.get(0) + 1][s.get(1)] + " down");
                if (vals[s.get(0) + 1][s.get(1)] == target) {
                    printArray(vals);
                    printArray(paths);
                    System.out.println("ans = (" + (s.get(0) + 1) + ", " + s.get(1) + ")");
                    return paths[s.get(0) + 1][s.get(1)];
                }
                q.add(new ArrayList<>(Arrays.asList(s.get(0) + 1, s.get(1))));
            }
            if (s.get(1) < cols - 1 && !visited[s.get(0)][s.get(1) + 1]) {
                visited[s.get(0)][s.get(1) + 1] = true;
                vals[s.get(0)][s.get(1) + 1] = vals[s.get(0)][s.get(1)] + 1;
                paths[s.get(0)][s.get(1) + 1] = paths[s.get(0)][s.get(1)] + 1;
                System.out.println(s.get(0) + " " + (s.get(1) + 1) + " " + vals[s.get(0)][s.get(1) + 1] + " right");
                if (vals[s.get(0)][s.get(1) + 1] == target) {
                    printArray(vals);
                    printArray(paths);
                    System.out.println("ans = (" + s.get(0) + ", " + (s.get(1) + 1) + ")");
                    return paths[s.get(0)][s.get(1) + 1];
                }
                q.add(new ArrayList<>(Arrays.asList(s.get(0), s.get(1) + 1)));
            }
        }
        printArray(paths);
        return -1;
    }
    static void printArray(int[][] a) {
        for (int[] ints : a) {
            for (int j : ints)
                System.out.print(j + " ");
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
}