import java.io.BufferedReader;
import java.util.*;
public class selection {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int length = iangay.nextInt(), chosen = iangay.nextInt(), odds = 0, evens = 0;
            for (int i = 0; i < length; i++) {
                int x = iangay.nextInt();
                if (x%2 == 0) { evens++; }
                else { odds++; }
            }
            int index = 0;
            boolean bad = false;
            while (index < chosen) {
                if (index == 0) {
                    if (odds > 0) { odds--;index++; }
                    else { bad = true; break; }
                }
                else if (odds >= 2 && index + 2 <= chosen) {
                    odds -= 2; index += 2;
                }
                else if (evens > 0) { evens--; index++; }
                else { bad = true; break; }
            }
            if (!bad) { System.out.println("Yes"); }
            else { System.out.println("No"); }
        }
    }
}