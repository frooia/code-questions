import java.util.*;
public class spiderman {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt(), max = iangay.nextInt();
            int[] e = new int[n], w = new int[n];
            for (int i = 0; i < n; i++) { e[i] = iangay.nextInt(); }
            for (int i = 0; i < n; i++) { w[i] = iangay.nextInt(); }
            int l = 0, r = 0;
            long esum = 0, wsum = 0, maxesum = 0;
            while ((l < n && r < n) || wsum > max) {
                if (wsum <= max && esum > maxesum) { maxesum = esum; }
//                System.out.println(l+" "+r+" "+wsum+" "+esum);
                if (l > r) {
                    wsum += w[r];
                    esum += e[r];
                    r++;
                    continue;
                }
                if (wsum <= max) {
//                    System.out.println("add");
                    wsum += w[r];
                    esum += e[r];
                    r++;
                } else {
//                    System.out.println("sub");
                    esum -= e[l];
                    wsum -= w[l];
                    l++;
                }
            }
            if (wsum > max) {
//                System.out.println("fin");
                esum -= e[l];
                wsum -= w[l];
            }
            if (wsum <= max && esum > maxesum) { maxesum = esum; }
            System.out.println(maxesum);
        }
    }
}