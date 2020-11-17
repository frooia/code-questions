import java.util.*;
public class beautiful3 {
//    private static final char[] CHARS = {'a', 'b', 'c'};
    private static char replace(char before, char after) {
        if (after == '?') { return (char)('a' + (before - 'a' + 1)); }
        return 'x';
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            char[] str = iangay.next().toCharArray();
            boolean bad = false;
            for (int i = 0; i < str.length; i++) {
                if ((i > 0 && str[i] == str[i-1]) || (str[i] == str[i+1] && i < str.length - 1)) { bad = true; break; }
                if (str[i] == '?') {
                    if (str[i-1] == 'a') {

                    }
                }
            }
        }
    }
}