import java.util.*;
public class zmeigorynich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int numBlows = in.nextInt(); int heads = in.nextInt();
            HashMap<Integer, Integer> blows = new HashMap<>();
            int bestD = 0; int bestDiff = 0;
            // use maxD as the last hit if it has higher damage than bestD
            for (int j = 0; j < numBlows; j++) {
                int d = in.nextInt(); int h = in.nextInt();
                if (d - h > bestDiff) { bestDiff = d-h; bestD = d; }
                if (d > h) { blows.put(d, h); }
            }
            if (blows.size() != 0) {
                int maxD = Collections.max(blows.keySet());
                int hits1 = (heads - blows.get(bestD)) / (bestD - blows.get(bestD));
                int hits2 = (heads - blows.get(maxD)) / (maxD - blows.get(maxD));
                if ((heads - blows.get(bestD)) % (bestD - blows.get(bestD)) != 0) { hits1++; }
                if ((heads - blows.get(maxD)) % (maxD - blows.get(maxD)) != 0) { hits2++; }
                System.out.println(Math.min(hits1, hits2));
            }
            else { System.out.println(-1); }
        }
    }
}
