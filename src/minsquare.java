import java.util.*;
public class minsquare {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int a = iangay.nextInt();
            int b = iangay.nextInt();
            if (a < b) {
                if (2 * a < b) {
                    System.out.println(b*b);
                }
                else {
                    System.out.println(4*a*a);
                }
            }
            else {
                if (2 * b < a) {
                    System.out.println(a*a);
                }
                else {
                    System.out.println(4*b*b);
                }
            }
        }
    }
}