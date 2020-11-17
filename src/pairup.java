import java.util.*;
public class pairup {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int pairs = iangay.nextInt();
        TreeMap<Long, Long> tm = new TreeMap<>(); // val, freq
        for (int i = 0; i < pairs; i++) {
            long freq = iangay.nextLong(), out = iangay.nextLong();
            if (tm.containsKey(out))
                tm.put(out, tm.get(out) + freq);
            else tm.put(out, freq);
        }
//        System.out.println(tm.toString());
        long max = 0;
        Map.Entry<Long, Long> f, l;
        while (!tm.isEmpty()) {
            if (tm.size()==1 && tm.get(tm.firstKey())%2 == 0) break;
            f = tm.pollFirstEntry();
            l = tm.pollLastEntry();
            max = Math.max(f.getKey() + l.getKey(), max);
            if (f.getValue() > l.getValue()) {
                tm.put(f.getKey(), f.getValue() - l.getValue());
            }
            else if (l.getValue() > f.getValue()) {
                tm.put(l.getKey(), l.getValue() - f.getValue());
            }
        }
        if (tm.size() == 1)
            max = Math.max(max, 2 * tm.pollFirstEntry().getKey());
        System.out.println(max);
    }
}