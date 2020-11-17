import java.util.*;
public class upsolver {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt();
            TreeMap<Integer, String> tmap = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                String name = iangay.next();
                int score = iangay.nextInt() - iangay.nextInt();
                tmap.put(score, name);
            }
            System.out.println(tmap.get(tmap.lastKey()));
        }
    }
}