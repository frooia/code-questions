import java.util.*;
public class composing {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            HashSet<Integer> distinct = new HashSet<>();
            HashMap<Integer, Integer> same = new HashMap<>();
            for (int j = 0; j < length; j++) {
                int x = iangay.nextInt();
                distinct.add(x);
                if (same.containsKey(x)) { same.put(x, same.get(x)+1); }
                else { same.put(x, 1); }
            }
            if (length == 1) { System.out.println(0); }
            else {
                int max = Collections.max(same.values());
                ArrayList<Integer> values = new ArrayList<>(same.values());
                Collections.sort(values);
                if (values.lastIndexOf(max) == values.size()-1 && distinct.size() == max) { max--; }
                System.out.println(Math.min(max, distinct.size()));
            }
        }
    }
}

