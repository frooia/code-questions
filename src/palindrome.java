import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt(); int max = iangay.nextInt();
            int[] a = new int[length];
            for (int j = 0; j < length; j++) { a[j] = iangay.nextInt(); }
            HashMap<Integer, Integer> sums = new HashMap<>();
            for (int j = length / 2; j >= 0; j--) {
                int sum = a[j]+a[length-j+1];
                if (sums.containsKey(sum)) { int x = sums.get(sum); sums.put(sum, x); }
                else { sums.put(sum, 1); }
            }
            Arrays.sort(a); int sumMax = max+a[0];
        }
    }
}