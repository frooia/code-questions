import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class _Sieve_of_Eratosthenes {
    private static void sieve(int a, int q) { // q is problem-specific, remove later
        // Non-specific sieve
        boolean[] isPrime = new boolean[a+1];
        Arrays.fill(isPrime, true);
        List<Integer> primes = new ArrayList<>();
        isPrime[0] = false;
        isPrime[1] = false;
        int root = (int) Math.ceil(Math.sqrt(isPrime.length));
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j < isPrime.length; j += i) isPrime[j] = false;
                primes.add(i);
            }
        }

        // Problem-specific output and input
        System.out.println(primes.size());
        FastScanner fs = new FastScanner(System.in);
        for (int i = 0; i < q; i++) {
            int k = fs.nextInt();
            if (isPrime[k]) System.out.println(1);
            else System.out.println(0);
        }
    }

    // Problem-specific main method
    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);
        int x = fs.nextInt(), q = fs.nextInt();
        sieve(x, q);
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
