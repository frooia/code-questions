import java.util.*;
public class adjacent {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            int[] init = new int[length];
            for (int j = 0; j < length; j++) { init[j] = iangay.nextInt(); }
            Arrays.sort(init);
            int[] done = new int[length];
            for (int j = 0; j < length/2; j++) {
                done[length-2*j-1] = init[length-j-1];
                done[length-2*j-2] = init[j];
            }
            if (length % 2 == 1) { done[0] = init[length/2]; }
            for (int x : done) { System.out.print(x+" "); }
            System.out.println();
        }
    }
}