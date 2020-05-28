import java.util.*;
public class lighting {
    public static int lights(int x, int y) {
        if (x%2 == 0) {
            return x / 2 * y;
        }
        if (y%2 == 0) {
            return x / 2 * y + y / 2;
        }
        return x / 2 * y + y / 2 + 1;
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int x = iangay.nextInt();
            int y = iangay.nextInt();
            System.out.println(Math.min(lights(x,y), lights(y,x)));
        }
    }
}