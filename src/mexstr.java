import java.util.*;
import java.io.*;
public class mexstr {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            String s = fs.next();
            HashSet<Character> sset = new HashSet<>();
            HashSet<String> sset2 = new HashSet<>();
            for (int i = 0; i < s.length(); i++)
                sset.add(s.charAt(i));
            for (int i = 0; i < s.length()-1; i++) {
                sset2.add(s.substring(i, i + 2));
            }
            // out.println(sset2.toString());
            if (sset.size() < 26) {
                for (int i = 0; i < 26; i++) {
                    if (!sset.contains((char) ('a' + i))) {
                        out.println((char) ('a' + i));
                        break;
                    }
                }
            }
            else {
                boolean broken = false;
                for (int i = 0; i < 26; i++) {
                    for (int j = 0; j < 26; j++) {
                        String find = (char)('a' + i) + "" + (char)('a' + j);
                        if (!sset2.contains(find)) {
                            out.println(find);
                            broken = true;
                            break;
                        }
                    }
                    if (broken) break;
                }
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