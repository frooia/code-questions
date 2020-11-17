import java.util.*;
public class naptime {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt();
            ArrayList<pair> t = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                t.add(new pair(iangay.nextInt(), iangay.nextInt()));
            }
            t.sort(pair::compareTo);
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            for (int i = 1; i < n; i++) {
                if (t.get(i).k > t.get(i-1).v) {
                    tm.put(t.get(i).k, t.get(i).v);
                }
            }
        }
    }
}