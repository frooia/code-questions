import java.util.*;
public class xenia {
    static int upper_bound(int[] a, int key) {
        int mid = a.length / 2;
        if (key == a[mid]) { return mid; }
        else if (key < a[mid]) {}
        return 0;
    }
    static int solve(int[] a, int[] b, int[] c) {
        return 0;
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int nRed = iangay.nextInt(), nGreen = iangay.nextInt(), nBlue = iangay.nextInt();
            int[] reds = new int[nRed], greens = new int[nGreen], blues = new int[nBlue];
            for (int j = 0; j < nRed; j++) { reds[j] = iangay.nextInt(); }
            for (int j = 0; j < nGreen; j++) { greens[j] = iangay.nextInt(); }
            for (int j = 0; j < nBlue; j++) { blues[j] = iangay.nextInt(); }
            Arrays.sort(reds); Arrays.sort(greens); Arrays.sort(blues);

        }
    }
}