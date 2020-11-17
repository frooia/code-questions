import java.util.*;
public class lineup {
    private static final HashMap<String, Integer> COWS = new HashMap<>() {{
        put("Beatrice", 0); put("Belinda", 1); put("Bella", 2); put("Bessie", 3); put("Betsy", 4); put("Blue", 5); put("Buttercup", 6); put("Sue", 7);
    }};
    private static final HashMap<Integer, String> COWSREV = new HashMap<>() {{
        put(0, "Beatrice"); put(1, "Belinda"); put(2, "Bella"); put(3, "Bessie"); put(4, "Betsy"); put(5, "Blue"); put(6, "Buttercup"); put(7, "Sue");
    }};
    private static TreeSet<String[]> perms = new TreeSet<>(new Comparator<String[]>() {
        @Override
        public int compare(String[] o1, String[] o2) {
            return compareTo(o1, o2);
        }
    });
    private static boolean[] used = new boolean[8];
    private static boolean[][] constraints = new boolean[8][8];
    private static int compareTo(String[] o1, String[] o2) {
        if (o1.length == o2.length) {
            for (int i = 0; i < o1.length; i++) {
                if (!o1[i].equals(o2[i]) || i == o1.length - 1)
                    return o1[i].compareTo(o2[i]);
            }
        }
        return o1.length - o2.length;
    }
    private static void solve(String[] perm, int k) {
        if (k == perm.length) perms.add(perm);
        else {
            for (int i = 0; i < perm.length; i++) {
                if (!used[i]) {
                    perm[i] = COWSREV.get(i);
                    used[i] = true;
                    solve(perm, k + 1);
                    used[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int n = iangay.nextInt();
        while (n --> 0) {
            String[] line = iangay.nextLine().split(" ");
            constraints[COWS.get(line[0])][COWS.get(line[5])] = true;
            constraints[COWS.get(line[5])][COWS.get(line[0])] = true;
        }

    }
}