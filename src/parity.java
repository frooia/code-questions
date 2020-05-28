import java.util.*;
public class parity {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = iangay.nextInt();
            int k = iangay.nextInt();
            if (k > n) { System.out.println("NO"); }
            else {
                if (n % 2 == 1 && k % 2 == 0) { // n odd k even
                    System.out.println("NO");
                }
                else if ((n % 2 == 1 && k % 2 == 1) || (n % 2 == 0 && k % 2 == 0)) {
                    // n odd k odd or n even k even
                    System.out.println("YES");
                    for (int j = 0; j < k-1; j++) { System.out.print(1+" "); }
                    System.out.println(n-k+1);
                }
                else { // n even k odd
                    if (n < 2*k) { System.out.println("NO"); }
                    else {
                        System.out.println("YES");
                        for (int j = 0; j < k-1; j++) { System.out.print(2+" "); }
                        System.out.println(n-2*(k-1));
                    }
                }
            }
        }
    }
}