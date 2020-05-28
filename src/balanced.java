import java.util.*;
public class balanced {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            if (length % 4 != 0) { System.out.println("NO"); }
            else {
                int[] a = new int[length]; int sum = 0;
                for (int j = 0; j < length / 2; j++) { a[j] = 2 * (j+1); sum+= a[j]; }
                for (int j = 0; j < length / 4; j++) { a[length/2+j] = a[j] - 1; }
                for (int j = 0; j < length / 4; j++) { a[3*length/4+j] = a[length/4+j]+1; }
                System.out.println("YES");
                for (int x : a) { System.out.print(x+" "); }
                System.out.println();
            }
        }
    }
}