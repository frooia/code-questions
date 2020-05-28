import java.util.*;
public class kuriyama {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int length = iangay.nextInt();
        int[] costs = new int[length];
        long[] sumCosts = new long[length+1]; sumCosts[0] = 0;
        for (int i = 1; i < length+1; i++) {
            costs[i-1] = iangay.nextInt();
            sumCosts[i] = sumCosts[i-1] + costs[i-1];
//            System.out.print(sumCosts[i]+" ");
        }
//        System.out.println();
        Arrays.sort(costs);
        long[] sortedCosts = new long[length+1]; sortedCosts[0] = 0;
        for (int i = 1; i < length+1; i++) {
            sortedCosts[i] = sortedCosts[i-1] + costs[i-1];
//            System.out.print(sortedCosts[i]+" ");
        }
//        System.out.println();
        int numQ = iangay.nextInt();
        for (int i = 0; i < numQ; i++) {
            int q = iangay.nextInt();
            int l = iangay.nextInt();
            int r = iangay.nextInt();
            if (q == 1) { System.out.println(sumCosts[r] - sumCosts[l-1]); }
            else { System.out.println(sortedCosts[r] - sortedCosts[l-1]); }
        }
    }
}