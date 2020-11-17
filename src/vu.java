import java.util.*;
public class vu {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            HashMap<Integer, Integer> m = new HashMap<>();
            m.put(1, 0);
            int n = iangay.nextInt();
            for (int i = 0; i < n; i++) {
                int x = iangay.nextInt();
                if (m.containsKey(x)) {
                    System.out.println(m.get(x));
                }
                else {
                    System.out.println("new");
                }
                m.put(x, i + 1);
            }
        }
    }
}