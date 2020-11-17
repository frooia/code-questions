import java.util.*;
public class haybales {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int n = iangay.nextInt(), q = iangay.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) { map.put(iangay.nextInt(), 0); }
        int count = 1;
        for (int x : map.keySet()) { map.put(x, count++); }
        for (int i = 0; i < q; i++) {
            int l = iangay.nextInt(), r = iangay.nextInt();
            if (l > map.lastKey() || r < map.firstKey()) { System.out.println(0); }
            else { System.out.println(map.get(map.floorKey(r)) - map.get(map.ceilingKey(l)) + 1); }
        }
    }
}