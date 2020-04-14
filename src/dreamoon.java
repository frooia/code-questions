import java.util.*;
public class dreamoon {
    private static int choose(int n, int k) {
        if (n == k || k == 0) { return 1; }
        return choose(n - 1, k - 1) + choose(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        char[] correctS = iangay.next().toCharArray();
        int correctDest = 0; int receivedDest = 0; int receivedQ = 0;
        for (char s : correctS) {
            if (s == '+') { correctDest++;}
            else { correctDest--; }
        }
        char[] receivedS = iangay.next().toCharArray();
        for (char s : receivedS) {
            if (s == '+') { receivedDest++;}
            else if (s == '-') { receivedDest--; }
            else { receivedQ++; }
        }
        int travelDist =  correctDest - receivedDest;
        double prob;
        if (receivedQ % 2 != Math.abs(travelDist) % 2 || receivedQ < Math.abs(travelDist)) { prob = 0.0; }
        else { prob = choose(receivedQ, (receivedQ + travelDist) / 2) / Math.pow(2, receivedQ); }
        System.out.println(prob);
    }
}
