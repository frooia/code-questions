import java.util.*;
public class pairs {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            int[] nums = new int[length];
            int evens = 0; int odds = 0;
            for (int j = 0; j < length; j++) {
                nums[j] = iangay.nextInt();
                if (nums[j] % 2 == 0) { evens++; }
                else { odds++; }
            }
            if (evens%2 != odds%2) { System.out.println("NO"); }
            else if (evens%2 == 0) { System.out.println("YES"); }
            else {
                Arrays.sort(nums);
                boolean good = false;
                for (int j = 0; j < length-1; j++) {
                    if (nums[j+1] - nums[j] == 1) { good = true; break; }
                }
                if (good) { System.out.println("YES"); }
                else { System.out.println("NO"); }
            }
        }
    }
}