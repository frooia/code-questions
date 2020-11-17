import java.util.*;
public class sonya {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int n = iangay.nextInt(), d = iangay.nextInt(), count = 2;
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = iangay.nextInt();
            if (i > 0) {
                if (h[i] - h[i-1] > 2 * d) {
                    count += 2;
                }
                else if (h[i] - h[i-1] == 2 * d) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}