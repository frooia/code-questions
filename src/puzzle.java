import java.util.*;
public class puzzle {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = iangay.nextInt();
            int m = iangay.nextInt();
            if (n == 1 || m == 1 || (n == 2 && m == 2)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}