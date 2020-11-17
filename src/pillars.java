import java.util.*;
public class pillars {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int l = iangay.nextInt();
        int[] d = new int[l];
        boolean good = true, hasMax = false;
        for (int i = 0; i < l; i++) { d[i] = iangay.nextInt(); }
        for (int i = 1; i < l; i++) {
            if (d[i] > d[i-1]) {
                if (hasMax) { good = false; }
            }
            else { hasMax = true; }
        }
        if (good) { System.out.println("YES"); }
        else { System.out.println("NO"); }
    }
}