import java.io.*;
import java.util.*;
public class kuriyama {
    public static void main(String[] args) {
        FastScanner iangay = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int length = iangay.nextInt();
        int[] costs = new int[length];
        long[] sumCosts = new long[length+1];
        for (int i = 1; i < length+1; i++) {
            costs[i-1] = iangay.nextInt();
            sumCosts[i] = sumCosts[i-1] + costs[i-1];
//            System.out.print(sumCosts[i]+" ");
        }
//        System.out.println();
        fastsort(costs);
        long[] sortedCosts = new long[length+1];
        for (int i = 1; i < length+1; i++) {
            sortedCosts[i] = sortedCosts[i-1] + costs[i-1];
//            System.out.print(sortedCosts[i]+" ");
        }
//        System.out.println();
        int numQ = iangay.nextInt();
        for (int i = 0; i < numQ; i++) {
            int q = iangay.nextInt();
            int l = iangay.nextInt();
            int r = iangay.nextInt();
            if (q == 1) { pw.println(sumCosts[r] - sumCosts[l-1]); }
            else { pw.println(sortedCosts[r] - sortedCosts[l-1]); }
        }
        pw.close();
    }
    private static void fastsort(int[] a) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : a) arr.add(i);
        Collections.sort(arr);
        for (int i = 0; i < a.length; i++) a[i] = arr.get(i);
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