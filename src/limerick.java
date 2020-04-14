import java.util.*;
public class limerick {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int n = iangay.nextInt();
        HashMap<Integer, Integer> divisors = new HashMap<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { divisors.put(i, n / i); }
        }
        int maxDiv = Collections.max(divisors.keySet());
        System.out.println(maxDiv + "" + divisors.get(maxDiv));
    }
}
