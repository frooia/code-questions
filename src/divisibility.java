import java.util.*;
public class divisibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int a = in.nextInt(); int b = in.nextInt();
            if (a <= b) { System.out.println(b - a); }
            else if (a % b == 0) { System.out.println(0); }
            else { System.out.println(b - a % b); }
        }
    }
}
