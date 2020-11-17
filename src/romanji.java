import java.util.*;
public class romanji {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        char[] l = iangay.next().toCharArray();
        boolean bad = false;
        for (int i = 0; i < l.length-1; i++) {
            if (!(l[i] == 'a' || l[i] == 'e' || l[i] == 'i' || l[i] == 'n' || l[i] == 'o' || l[i] == 'u') &&
                    !(l[i+1] == 'a' || l[i+1] == 'e' || l[i+1] == 'i' || l[i+1] == 'o' || l[i+1] == 'u')) {
                bad = true;
            }
        }
        if (l[l.length-1] != 'a' && l[l.length-1] != 'e' && l[l.length-1] != 'i' && l[l.length-1] != 'n' && l[l.length-1] != 'o' && l[l.length-1] != 'u') {
            bad = true;
        }
        if (bad) { System.out.println("NO"); }
        else { System.out.println("YES"); }
    }
}