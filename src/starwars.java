// https://vjudge.net/problem/Kattis-cantinaofbabel
import java.util.*;
import java.io.*;
class starwars {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt();
        int[][] g = new int[n][n];
        HashMap<String, Integer> l = new HashMap<>(); // languages and their indices
        HashMap<Integer, ArrayList<Integer>> u = new HashMap<>(); // language : who understands it
        ArrayList<Integer> s = new ArrayList<>(); // spoken language of the index character

        for (int i = 0; i < n; i++) {
            String[] line = fs.nextLine().split(" ");
            // add spoken lang into l
            if (!l.containsKey(line[1]))
                l.put(line[1], l.size());
            s.add(l.get(line[1]));

            // add person's understood languages into u
            for (int j = 2; j < line.length; j++) {
                if (!l.containsKey(line[j]))
                    l.put(line[j], l.size());
                int langindex = l.get(line[j]);
                if (!u.containsKey(langindex)) {
                    u.put(langindex, new ArrayList<>());
                }
                u.get(langindex).add(i);
            }
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