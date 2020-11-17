import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int l = iangay.nextInt();
            int[] a = new int[l];
            int evens = 0, odds = 0, goods = 0;
            for (int i = 0; i < l; i++) {
                a[i] = iangay.nextInt();
                if (a[i]%2 == 0) { evens++; }
                else { odds++; }
                if (i%2 == a[i]%2) { goods++; }
            }
            if ((l%2 == 0 && evens != odds) || (l%2 == 1 && evens - 1 != odds)) { System.out.println(-1); }
            else { System.out.println((l - goods) / 2); }
        }
    }
}