import java.util.*;
public class shovels {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt(), k = iangay.nextInt(), i = (int)Math.max(Math.sqrt(n), k);
            while (i > 0) {
                if (n%i == 0) { break; }
                i--;
            }
            System.out.println(n / i);
        }
    }
}