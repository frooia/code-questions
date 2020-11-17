import java.util.*;
public class vasya4 {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int l = iangay.nextInt();
        String a = iangay.next();
        if (a.length() >= l) {
            int out = 0;
            for (int i = l; i < a.length(); i+=l) {
                if (a.substring(i - 3, i).equals("bbb") || a.substring(i - 3, i).equals("aaa")) {
                    out++;
                }
            }
            System.out.println(out);
        }
        else {
            System.out.println(0);
        }
    }
}