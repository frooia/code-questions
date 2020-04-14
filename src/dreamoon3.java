import java.util.*;
public class dreamoon3 {
    private static boolean isPerm(List<Integer> a) {
        TreeSet<Integer> tree = new TreeSet<>(a);
        return tree.size() == a.size() && tree.last() == a.size();
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int listLength = iangay.nextInt();
            ArrayList<Integer> totalList = new ArrayList<>();
            for (int j = 0; j < listLength; j++) { totalList.add(iangay.nextInt()); }
            TreeSet<Integer> tree = new TreeSet<>(totalList);
            HashMap<Integer, Integer> lvalues = new HashMap<>();
            int biggest = tree.last(); int pivot = totalList.indexOf(biggest);
            if (isPerm(totalList.subList(0, biggest)) && isPerm(totalList.subList(biggest, listLength))) { lvalues.put(biggest, listLength-biggest); }
            if (isPerm(totalList.subList(0, listLength-biggest)) && isPerm(totalList.subList(listLength-biggest, listLength))) { lvalues.put(listLength-biggest, biggest); }
            System.out.println(lvalues.size());
            lvalues.forEach((k, v) -> { System.out.println(k+" "+v); });
        }
    }
}
