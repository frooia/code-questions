import java.util.*;
import java.io.*;
public class artem2 {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        char[] dirs = fs.next().toCharArray();
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) { dist[i] = fs.nextInt(); }
        long curr = 0;
        boolean loop = false;
        while (curr >= 0 && curr < n) {
            if (visited[(int)curr]) { loop = true; break; }
//            System.out.println(curr);
            visited[(int)curr] = true;
            if (dirs[(int)curr] == '>') { curr += dist[(int)curr]; }
            else { curr -= dist[(int)curr]; }
        }
        if (!loop) { System.out.println("FINITE"); }
        else { System.out.println("INFINITE"); }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner() { br = new BufferedReader(new InputStreamReader(System.in)); }
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