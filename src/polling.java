import java.util.*;
public class polling {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int n = iangay.nextInt();
        while (n --> 0) {
            String p = iangay.next();
            if (!map.containsKey(p)) {
                map.put(p, 1);
            }
            else {
                map.put(p, map.get(p) + 1);
            }
        }
        TreeSet<String> winners = new TreeSet<>();
        int max = 0;
        for (String k : map.keySet()) { if (map.get(k) > max) { max = map.get(k); } }
        for (String k : map.keySet()) { if (map.get(k) == max) { winners.add(k); } }
        for (String k : winners) {
            System.out.println(k);
        }
    }
}