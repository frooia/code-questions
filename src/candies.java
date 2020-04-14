import java.util.*;
public class candies {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            long n = iangay.nextLong();
            System.out.println((long)(Math.ceil(n / 2.0) - 1));
        }
    }
}
