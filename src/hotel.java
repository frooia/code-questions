import java.util.*;
public class hotel {
    public static int mod(int a, int b) {
        return (b + a % b) % b;
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            int[] a = new int[length];
            TreeSet<Integer> mods = new TreeSet<>();
            for (int j = 0; j < length; j++) {
                a[j] = iangay.nextInt();
                int x = mod(a[j] + j, length);
                mods.add(x);
//                System.out.print(x+" ");
            }
//            System.out.println();
            if (mods.size() == length) { System.out.println("YES"); }
            else { System.out.println("NO"); }
        }
    }
}