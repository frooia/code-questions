import java.text.DecimalFormat;
import java.util.*;
public class BallsBins
{
    public static boolean sim(int n)
    {
        int [] bins = new int[n];
        for (int i = 0; i < bins.length; i++) { bins[i] = 0; } // initiate 0s
        Random random = new Random();
        for (int i = 0; i < bins.length; i++) {
            bins[random.nextInt(n)]++;
        }
        for (int i = 0; i < bins.length; i++) {
            if (bins[i] != 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int numCases = in.nextInt();
        for (int i = 0; i < numCases; i++) {
            int balls = in.nextInt();
            double wins = 0.0;
            double total = 0.0;
            while (total <= 100000000) {
                if (sim(balls)) {
                    wins++;
                }
                total++;
            }
            System.out.println("Balls and Bins Game #"+(i+1)+": "+String.format("%.6f", wins/total*100));
        }
    }
}
