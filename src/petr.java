import java.util.*;
public class petr {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int[] degrees = new int[iangay.nextInt()];
        for (int i = 0; i < degrees.length; i++) { degrees[i] = iangay.nextInt(); }
        boolean isCombo = false;
        for (int i = 0; i < Math.pow(2, degrees.length) - 1; i++) {
            int total = 0;
            StringBuilder combo = new StringBuilder(Integer.toBinaryString(i));
            combo.append(String.join("", Collections.nCopies(degrees.length - combo.length(), "0")));
            for (int j = 0; j < degrees.length; j++) {
                if (combo.charAt(j) == '1') { total += degrees[j]; }
                else { total -= degrees[j]; }
            }
            if (total % 360 == 0) { isCombo = true; break; }
        }
        if (isCombo) { System.out.println("YES"); }
        else { System.out.println("NO"); }
    }
}
