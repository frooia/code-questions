import java.util.*;
public class napsack {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int nS = iangay.nextInt(), nH = iangay.nextInt();
            long w = iangay.nextInt(), c = 0;
            ArrayList<pair> sacks = new ArrayList<>();
            for (int i = 0; i < nS; i++) {
                sacks.add(new pair(iangay.nextInt(), iangay.nextInt()));
            }
            sacks.sort(pair::compareTo);
            int max = 0;
            for (int i = nS - 1; i >= 0; i--) {
                if (sacks.get(i).k < max) {
                    sacks.set(i, new pair(max, sacks.get(i).v));
                }
                else { max = sacks.get(i).k; }
            }
            int[] houses = new int[nH];
            int index = 0;
            boolean tooFat = false;
            for (int i = 0; i < nH; i++) {
                houses[i] = iangay.nextInt();
                w += houses[i];
                while (index < sacks.size() && sacks.get(index).v < w) { index++; }
                if (index == sacks.size()) { tooFat = true; }
                if (!tooFat) { c += sacks.get(index).k; }
            }
//            for (Pair x : sacks) { System.out.println("("+x.k+", "+x.v+")"); }
            System.out.println(c);
        }
    }
}