import java.util.*;
public class sticks {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt();
            if (n%2 == 0) {
                System.out.println(n/2);
            }
            else {
                System.out.println(1 + (n-1)/2);
            }
        }
    }
}