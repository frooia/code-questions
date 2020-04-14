import java.util.*;
public class threestrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            char[] a = in.next().toCharArray();
            char[] b = in.next().toCharArray();
            char[] c = in.next().toCharArray();
            boolean rearrangeable = true;
            for (int j = 0; j < a.length; j++) {
                if (a[j] != b[j] && a[j] != c[j] && b[j] != c[j] || (a[j] == b[j] && b[j] != c[j])) {
                    rearrangeable = false;
                    break;
                }
            }
            if (rearrangeable) { System.out.println("YES"); }
            else { System.out.println("NO"); }
        }
    }
}
