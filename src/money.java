import java.util.*;
public class money {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int d = iangay.nextInt(), m = iangay.nextInt(), n = iangay.nextInt(), e = iangay.nextInt(), a = iangay.nextInt();
            System.out.println(((d + m) - (n * e)) / a);
        }
    }
}