import java.util.*;
import java.io.*;
class erectfence {
    public int[][] outerTrees(int[][] trees) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[trees.length];
        int leftI = 0;
        for (int i = 0; i < trees.length; i++)
            if (trees[i][0] < trees[leftI][0])
                leftI = i;
        visited[leftI] = true;
        int currI =  leftI;
        leftI = 0;
        ans.add(new ArrayList<>(Arrays.asList(trees[leftI][0], trees[leftI][1])));

        while (leftI != currI) {
            for (int i = 0; i < trees.length; i++) {
                if (visited[i] || currI == i || leftI == i) continue;
                int cp = crossProduct(trees[currI][0], trees[currI][1], trees[leftI][0], trees[leftI][1], trees[i][0], trees[i][1]);
                if (cp > 0) {
                    leftI = i;
                } else if (cp == 0) {
                    
                }
            }
            ans.add(new ArrayList<>(Arrays.asList(trees[leftI][0], trees[leftI][1])));
            currI = leftI;
            leftI = 0;
        }

        int[][] realAns = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            realAns[i][0] = ans.get(i).get(0);
            realAns[i][1] = ans.get(i).get(1);
        }
        return realAns;
    }

    public static int crossProduct(int ax, int ay, int bx, int by, int cx, int cy) {
        int x1 = ax - bx;
        int y1 = ay - by;
        int x2 = ax - cx;
        int y2 = ay - cy;
        return y2 * x1 - y1 * x2;
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