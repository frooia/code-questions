import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int l = iangay.nextInt();
            int[] a = new int[l], c = new int[3];
            for (int i : c) { i = 0; }
            for (int i = 0; i < l; i++) {
                a[i] = iangay.nextInt() % 3;
                c[a[i]]++;
            }
            Arrays.sort(a);
            System.out.println(c[0] + Math.min(c[1], c[2]) + (Math.max(c[1], c[2]) - Math.min(c[1], c[2])) / 3);
        }
    }
}