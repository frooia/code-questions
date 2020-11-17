import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt() + 1, rpos = -1;
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = iangay.nextInt();
                if (s[i] == 0) { rpos = i; }
            }
            int l = rpos - 1, r = rpos + 1, lmax = 0, rmax = 0, count = 0;
            while (l >= 0 || r < n) {
//                System.out.println(l+" "+r);
                if (l >= 0 && s[l] > lmax) {
                    count++;
                    lmax = s[l];
                }
                l--;
                if (r < n && s[r] > rmax) {
                    count++;
                    rmax = s[r];
                }
                r++;
//                System.out.println(lpause+" "+rpause);
            }
            System.out.println(count);
        }
    }
}