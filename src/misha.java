import java.util.*;
public class misha {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int numChanges = iangay.nextInt(), unique = 0;
        ArrayList<pair> changes = new ArrayList<>();
        HashMap<String, Integer> names = new HashMap<>();
        HashMap<Integer, String> namesr = new HashMap<>();
        int count = 0;
        for (int i = 0; i < numChanges; i++) {
            String f = iangay.next(), t = iangay.next();
            changes.add(new pair(f, t));
            if (!names.containsKey(f)) {
                namesr.put(count, f);
                names.put(f, count++);
            }
            if (!names.containsKey(t)) {
                namesr.put(count, t);
                names.put(t, count++);
            }
        }
//        System.out.println(names.toString());
        DSU dsu = new DSU(names.size());
        HashSet<String> init = new HashSet<>();
        for (pair p : changes) {
            if (dsu.size[names.get(p.k)] == 1) init.add(p.k);
            dsu.union(names.get(p.v), names.get(p.k));
        }
        System.out.println(init.size());
        for (String s : init) System.out.println(s+" "+namesr.get(dsu.find(names.get(s))));
    }
    static class DSU {
        int N;
        int[] parent, rank, size;
        DSU(int n) {
            N = n;
            parent = new int[N];
            rank = new int[N];
            size = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                rank[i] = 1;
                size[i] = 1;
            }
        }
        int find(int v) { // average time O(logn)
            if (parent[v] == v) return v;
            return parent[v] = find(parent[v]);
        }
        void union(int a, int b) { // average time O(logn)
            a = find(a); b = find(b);
            parent[b] = a;
            size[a] += size[b];
            rank[a]++;
        }
    }

    static class pair implements Comparable<pair> {
        String k, v;
        pair(String k, String v) {
            this.k = k;
            this.v = v;
        }
        @Override
        public int compareTo(pair o) {
            if (!this.k.equals(o.k))
                return this.k.compareTo(o.k);
            return this.v.compareTo(o.v);
        }
        public String toString() {
            return "("+k+", "+v+")";
        }
    }
}