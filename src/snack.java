import java.util.*;
import java.io.*;
class food {
    private String name;
    food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class cs implements Comparator<food> {
    public int compare(food a, food b) {
        int sa = 0, sb = 0;
        for (int i = 0; i < a.getName().length(); i++) {
            if (a.getName().charAt(i) == 'a' || a.getName().charAt(i) == 'e' || a.getName().charAt(i) == 'i' || a.getName().charAt(i) == 'o' || a.getName().charAt(i) == 'u') {
                sa++;
            }
            else if (a.getName().charAt(i) == 'y') sa+=2;
        }
        for (int i = 0; i < b.getName().length(); i++) {
            if (b.getName().charAt(i) == 'a' || b.getName().charAt(i) == 'e' || b.getName().charAt(i) == 'i' || b.getName().charAt(i) == 'o' || b.getName().charAt(i) == 'u') {
                sb++;
            }
            else if (b.getName().charAt(i) == 'y') sb+=2;
        }
//        System.out.println(sa+" "+sb);
        if (sb != sa) return sb-sa;
        return a.getName().compareTo(b.getName());
    }
}
public class snack {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = fs.nextInt();
            ArrayList<food> s = new ArrayList<>();
//            out.println(s.toString());
            for (int i = 0; i < n; i++) s.add(new food(fs.next()));
            s.sort(new cs());
//            out.println(s.toString());
            out.println("Cabinet #"+(t+1)+":");
            for (food food : s) {
                out.println(food.getName());
            }
            out.println();
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