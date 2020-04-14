import java.util.*;
public class motarack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = in.nextInt();
            int[] nums = new int[length];
            int k = 0; int m = 0; int lastnon0index = -1;
            int smallest = -2; int largest = -2;
            for (int j = 0; j < length; j++) {
                nums[j] = in.nextInt();
                if (k == 0 && nums[j] != -1) { k = nums[j]; lastnon0index = j; }
                if (nums[j] == -1) {
                    if (j > 0) {

                    }
                }
            }
            for (int j = 0; j < length; j++) {
                if (nums[j] != -1) {
                    if (Math.abs(nums[j] - k) > m) {
                        if (j - lastnon0index > 1) {
                            k = (nums[j] + nums[lastnon0index]) / 2;
                            m = Math.max(Math.abs(nums[j] - k), Math.abs(nums[lastnon0index] - k));
                        }
                        else { m = Math.abs(nums[j] - k); }
                    }
                    lastnon0index = j;
                }
            }
            System.out.println(m+" "+k);
        }
    }
}
