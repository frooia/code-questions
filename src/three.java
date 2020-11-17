import java.util.*;
public class three {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt(), index = -1;
            int[] p = new int[n];
            for (int i = 0; i < n; i++) { p[i] = iangay.nextInt(); }
            int j = 0, k = n - 1;
            boolean bad = true;
            for (int i = n; i > 0; i--) {
                if (p[j] == i) { j++; }
                else if (p[k] == i) { k--; }
                else {
                    bad = false;
                    int x = 0;
                    for (int m = j; m < k + 1; m++)
                        if (p[m] == i)
                            x = m;
                    System.out.println("YES\n"+(j+1)+" "+(x+1)+" "+(k+1));
                    break;
                }
            }
            if (bad) { System.out.println("NO"); }
        }
    }
}