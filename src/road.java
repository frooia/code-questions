import java.util.*;
public class road {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            long x = iangay.nextInt(); long y = iangay.nextInt();
            long a = iangay.nextInt(); long b = iangay.nextInt();
            long price = Math.abs(x-y) * a;
            if (2*a < b) { price += 2 * Math.min(x, y) * a; }
            else { price += Math.min(x, y) * b; }
            System.out.println(price);
        }
    }
}