import java.util.*;
public class surely {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int t1 = iangay.nextInt(), t2 = iangay.nextInt(), d = iangay.nextInt();
            if (t1 + d < t2 - d) {
                System.out.println(1);
            }
            else if (t2 + d < t1 - d) {
                System.out.println(2);
            }
            else {
                System.out.println(0);
            }
        }
    }
}