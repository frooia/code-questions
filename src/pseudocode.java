import java.util.*;
public class pseudocode {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            char[] s = iangay.next().toCharArray();
            int[] sums = new int[s.length];
            int sum = 0; boolean g1 = true;
            for (int i = 0; i < s.length; i++) {
                if (s[i] == '+') { sum += 1; }
                else { sum -= 1; }
                sums[i] = sum;
                if (sum < 0) { g1 = false; }
            }
            if (g1) { System.out.println(s.length); }
            else {
                long res = 1; int skip = 0;
                for (int i = 0; i < s.length; i++) {
                    if (i - skip + sums[i] < 0) {
                        res += i+1;
                    }
                    else {
                        skip++;
                    }
                }
                System.out.println(res);
            }
        }
    }
}