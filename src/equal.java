import java.util.*;
public class equal {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int length = iangay.nextInt();
        TreeSet<Integer> nums = new TreeSet<>();
        for (int i = 0; i < length; i++) { nums.add(iangay.nextInt()); }

        /*
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) { nums[i] = iangay.nextInt(); }
        boolean good = true;
        int d = 0;
        for (int i = 1; i < length; i++) {
            int diff = Math.abs(nums[i] - nums[i-1]);
            if (diff != 0 && d == 0) { d = diff; }
            else if (diff != 0 && d != diff) { good = false; break; }
//            System.out.print(diff + " ");
        }
         */
    }
}