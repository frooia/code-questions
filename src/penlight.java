import java.util.*;
public class penlight {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int x = iangay.nextInt(), y = iangay.nextInt(), a = iangay.nextInt(), b = iangay.nextInt();
            int min = Math.min(a, b), max = Math.max(a, b), r = max - min;
            if (r%2 == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}