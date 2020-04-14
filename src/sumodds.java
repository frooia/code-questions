import java.util.*;
public class sumodds {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int oddSum = iangay.nextInt();
            int numOdds = iangay.nextInt();
            boolean isPossible = false;
            if (oddSum % 2 != numOdds % 2 || Math.sqrt(oddSum) == (int)Math.sqrt(oddSum)) { isPossible = true; }
            else {
                int div = oddSum / numOdds; int remainder = oddSum % numOdds;
                if (div % 2 == 1) {
                    if ((oddSum % 2 == 1 && div - (numOdds - 1) > 0 && div + (numOdds - 1) + remainder < oddSum) ||
                            (oddSum % 2 == 0 && div - (numOdds - 1) > 0 && div + (numOdds - 1) + remainder < oddSum))
                    { isPossible = true; }
                }
            }
            if (isPossible) { System.out.println("YES"); }
            else { System.out.println("NO"); }
        }
    }
}
