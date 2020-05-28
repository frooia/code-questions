import java.util.*;
public class kana {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int x = iangay.nextInt();
            int absorb = iangay.nextInt();
            int lightning = iangay.nextInt();
            for (int j = 0; j < absorb; j++) {
                if (x > lightning * 10) { x = x / 2 + 10; }
            }
            if (x > lightning * 10) { System.out.println("NO"); }
            else { System.out.println("YES"); }
        }
    }
}