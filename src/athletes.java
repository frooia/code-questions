import java.util.*;
public class athletes {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            int[] athletes = new int[length];
            int minDiff = Integer.MAX_VALUE;
            for (int j = 0; j < length; j++) {
                athletes[j] = iangay.nextInt();
            }
            Arrays.sort(athletes);
            for (int j = 1; j < length; j++) {
                int diff = Math.abs(athletes[j] - athletes[j - 1]);
                if (diff < minDiff) { minDiff = diff; }
            }
            System.out.println(minDiff);
        }
    }
}