import java.util.*;
public class cupcakes {
    private static boolean posprefix(int[] a) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum <= 0) { return false; }
        }
        sum = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            sum += a[i];
            if (sum <= 0) { return false; }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int length = iangay.nextInt();
            int[] cupcakes = new int[length];
            for (int i = 0; i < length; i++) { cupcakes[i] = iangay.nextInt(); }
            if (posprefix(cupcakes)) { System.out.println("YES"); }
            else { System.out.println("NO"); }
        }
    }
}