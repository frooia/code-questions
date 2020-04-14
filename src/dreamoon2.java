import java.util.*;
public class dreamoon2 {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int prevRounds = iangay.nextInt();
            TreeSet<Integer> places = new TreeSet<>();
            int nextRounds = iangay.nextInt();
            for (int j = 0; j < prevRounds; j++) { places.add(iangay.nextInt()); }
            Iterator<Integer> itr = places.iterator();
            while (itr.hasNext()) { if (itr.next() <= nextRounds + 1) { nextRounds++; } }
            System.out.println(nextRounds);
        }
    }
}