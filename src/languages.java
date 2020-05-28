import java.util.*;
public class languages {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int n = iangay.nextInt(); int langs = iangay.nextInt();
        Map<Integer, ArrayList<Integer>> languages = new HashMap<>();
        for (int i = 0; i < langs; i++) { languages.put(i, new ArrayList<>()); }
        int lessons = 0;
        for (int i = 0; i < n; i++) {
            int length = iangay.nextInt();
            if (length == 0) { lessons++; }
            for (int j = 0; j < length; j++) { int v = iangay.nextInt()-1; languages.get(v).add(i); /* System.out.println("("+v+", "+i+") "); */ }
        }
        /*
        DSU dsu = new DSU(n);
        for (Map.Entry<Integer, ArrayList<Integer>> a : languages.entrySet()) {
//            System.out.print(a.getKey()+": ");
            for (int x = 0; x < a.getValue().size() - 1; x++) {
                dsu.union(a.getValue().get(x), a.getValue().get(x+1));
//                System.out.print(a.getValue().get(x)+" ");
            }
//             if (!a.getValue().isEmpty()) { System.out.println(a.getValue().get(a.getValue().size()-1)); }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(dsu.sizes[i]+" ");
        }
        for (Map.Entry<Integer, ArrayList<Integer>> a : languages.entrySet()) {
            System.out.print(a.getKey()+": ");
            for (int b : a.getValue()) { System.out.print(b+" "); }
            System.out.println();
        }
         */
        HashSet<Integer> people = new HashSet<>(); int prev = 0;
        for (Map.Entry<Integer, ArrayList<Integer>> a : languages.entrySet()) {
            if (a.getValue().isEmpty()) { continue; }
            people.addAll(a.getValue());
            if (prev != 0 && people.size() == prev + a.getValue().size()) { lessons++; System.out.println(a.getKey()); }
            prev = people.size();
        }
        for (Map.Entry<Integer, ArrayList<Integer>> a : languages.entrySet()) {
            System.out.print(a.getKey()+": ");
            for (int b : a.getValue()) { System.out.print(b+" "); }
            System.out.println();
        }
        System.out.println(lessons);
    }
}