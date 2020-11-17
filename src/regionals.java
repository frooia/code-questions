import java.util.*;
public class regionals {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            // input
            int a = iangay.nextInt(), q = iangay.nextInt(), busCount = 0;
            PriorityQueue<String> d = new PriorityQueue<>();
            ArrayList<ArrayList<String>> buses = new ArrayList<>();
            HashMap<String, TreeMap<Integer, Integer>> people = new HashMap<>();
            for (int i = 0; i < a; i++) {
                String action = iangay.next();
                if (action.equals("ADD")) {
                    String x = iangay.next();
                    d.add(x);
                    if (!people.containsKey(x)) {
                        TreeMap<Integer, Integer> y = new TreeMap<>();
                        y.put(0, 0);
                        people.put(x, y);
                    }
                }
                else {
                    busCount++;
                    int rem = iangay.nextInt();
                    ArrayList<String> r = new ArrayList<>();
                    for (int j = 0; j < rem; j++) {
                        if (d.size() == 0) { break; }
                        String x = d.poll();
                        r.add(x);
                        TreeMap<Integer, Integer> y = people.get(x);
                        if (!people.get(x).containsKey(busCount)) {
                            if (people.get(x).isEmpty()) { y.put(busCount, 1); }
                            else { y.put(busCount, y.get(y.lastKey()) + 1); }
                        }
                        else { y.put(busCount, y.get(y.lastKey()) + 1); }
                        people.put(x, y);
                    }
                    buses.add(r);
                }
//                System.out.println(people.toString());
            }
//            System.out.println(buses);
//            System.out.println(people.toString());

            // queries
            for (int i = 0; i < q; i++) {
                String question = iangay.next();
                int from = iangay.nextInt(), to = iangay.nextInt(), count = 0;
                if (!people.containsKey(question) || people.get(question).isEmpty() || from > people.get(question).lastKey() || to < people.get(question).firstKey()) { System.out.println(0); }
                else {
                    try {
                        count = people.get(question).get(people.get(question).floorKey(to)) - people.get(question).get(people.get(question).lowerKey(from));
                        System.out.println(count);
                    }
                    catch (IllegalArgumentException e) { System.out.println(0); }
                }
            }
        }
    }
}