import java.util.*;
public class square {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int x1 = iangay.nextInt(); int y1 = iangay.nextInt();
            int x2 = iangay.nextInt(); int y2 = iangay.nextInt();
            if ((x1 == x2 && x1 == (y1 + y2)) || (x1 == y2 && x1 == (y1 + x2)) || (y1 == x2 && y1 == (x1 + y2)) || (y1 == y2 && y1 == (x1 + x2))) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}