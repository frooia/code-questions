import java.util.*;
public class nastya {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int grains = iangay.nextInt();
            int a = iangay.nextInt(); int b = iangay.nextInt();
            int c = iangay.nextInt(); int d = iangay.nextInt();
            if (((a-b)*grains > c+d) || (a+b)*grains < c-d) { System.out.println("No"); }
            else { System.out.println("Yes"); }
        }
    }
}