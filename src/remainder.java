import java.util.*;
public class remainder {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int n = iangay.nextInt(), k = iangay.nextInt(), zcount = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = (k - iangay.nextInt() % k) % k;
                if (a[i] == 0) { zcount++; }
            }
            Arrays.sort(a);

//            for (int x : a) { System.out.print(x+" "); }
//            System.out.println();

            if (zcount == a.length) {
                System.out.println(0);
            }
            else {
                int count = 0, mod = 0, maxCount = 0, maxMod = mod;
                for (int i = zcount; i < n; i++) {
                    System.out.print(a[i] + " ");
                    if (a[i] == mod) {
                        count++;
//                        if (count > maxCount) {
//                            maxCount = count;
//                        }
                        System.out.print("nice ");
                    } else {
                        System.out.print("ok ");
                        if (i == n-1 || mod == 0) { mod = a[i]; }
                        if (count >= maxCount) {
                            maxCount = count;
                            maxMod = mod;
                            System.out.print("(" + maxMod + ") ");
                        }
                        mod = a[i];
                        count = 1;
                    }
                }
                if (count >= maxCount) {
                    maxCount = count;
                    maxMod = mod;
                }
                System.out.println();
                System.out.println(maxMod+" "+maxCount);
                int ans = maxMod + 1 + k * (maxCount - 1);
                System.out.println(ans);
            }
//            System.out.println((a[n - 1] - maxMod) + k * maxCount);
        }
    }
}