import java.util.*;
import java.io.*;
public class fairground {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = fs.nextInt();
        while (tc --> 0) {
            int n = fs.nextInt();
            long m = fs.nextLong();
            int[] order = new int[n];
            for (int i = 0; i < n; i++) order[i] = fs.nextInt()-1;
            ArrayList<Long>[] times = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                long k = fs.nextLong();
                ArrayList<Long> t = new ArrayList<>();
                for (long j = 0; j < k; j++) t.add(fs.nextLong());
                times[i] = t;
            }
            long currT = times[order[0]].get(0);
            int ans = 1;
            boolean allthrough = true;
//            out.println(Arrays.toString(times));
            for (int i = 1; i < n; i++) {
//                out.println(i);
                int currTindex = Collections.binarySearch(times[order[i]], currT);
                if (currTindex >= 0) currTindex++;
                else currTindex = (currTindex + 1) * (-1);
                if (currTindex < times[order[i]].size()) {
                    currT = times[order[i]].get(currTindex);
                }
                else {
                    allthrough = false;
                    ans = i;
                    break;
                }
            }
            if (allthrough) out.println(n);
            else out.println(ans);
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