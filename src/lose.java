import java.util.*;
public class lose {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int l = iangay.nextInt(), remove = 0;
        HashMap<Integer, Integer> c = new HashMap<>();
        int[] nums = {4, 8, 15, 16, 23, 42};
        for (int n : nums) { c.put(n, 0); }
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = iangay.nextInt();
            c.put(a[i], c.get(a[i]) + 1);
            int index = Arrays.binarySearch(nums, a[i]);
            boolean good = true;
            for (int j = 0; j < index; j++) {
                if (c.get(nums[j]) < c.get(a[i])) { good = false; break; }
            }
//            for (int n : nums) {
//                System.out.print("(" + n + ", " + c.get(n) + ") ");
//            }
//            System.out.println();
            if (!good) {
                remove++;
                c.put(a[i], c.get(a[i]) - 1);
//                System.out.println(i);
            }
        }
        int min = Collections.min(c.values());
        for (int n : nums) { remove += c.get(n) - min; }
        if (l < 6) { System.out.println(l); }
        else { System.out.println(remove); }
    }
}