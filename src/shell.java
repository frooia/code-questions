import java.util.*;
public class shell {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt(), a = iangay.nextInt();
            int[] sumpeas = new int[n + 1];
            for (int i = 1; i < n+1; i++) {
                sumpeas[i] = sumpeas[i-1] + iangay.nextInt();
            }
            boolean reversed = false;
            for (int i = 0; i < a; i++) {
                int choice = iangay.nextInt();
                if (choice == 1) { reversed = !reversed; }
                else {
                    int from = iangay.nextInt(), to = iangay.nextInt();
                    if (reversed) {
                        System.out.println(sumpeas[n+1-from] - sumpeas[n-to]);
                    }
                    else {
                        System.out.println(sumpeas[to] - sumpeas[from-1]);
                    }
                }
            }
        }
    }
}