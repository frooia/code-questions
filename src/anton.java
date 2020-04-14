import java.util.*;
public class anton {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        for (int i = 0; i < tc; i++) {
            int length = iangay.nextInt();
            int[] original = new int[length]; int[] ideal = new int[length];
            for (int j = 0; j < length; j++) { original[j] = iangay.nextInt(); }
            for (int j = 0; j < length; j++) { ideal[j] = iangay.nextInt(); }
            boolean possible = true;
            if (original[0] != ideal[0]) { possible = false; }
            else {
                boolean hasPos = false; boolean hasNeg = false;
                for (int j = 0; j < length; j++) {
                    if ((!hasNeg && ideal[j] < original[j]) || (!hasPos && ideal[j] > original[j])) { possible = false; break; }
                    if (original[j] < 0) { hasNeg = true; }
                    else if (original[j] > 0) { hasPos = true; }
                }
            }
            if (possible) { System.out.println("YES"); }
            else { System.out.println("NO"); }
        }
    }
}