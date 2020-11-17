import java.util.*;
public class vasya3 {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        String word = iangay.next();
        boolean bad = false;
        int h = word.indexOf("h");
        int e = word.indexOf("e", h+1);
        int l1 = word.indexOf("l", e+1);
        int l2 = word.indexOf("l", l1+1);
        int o = word.indexOf("o", l2+1);
        if (h == -1 || e == -1 || l1 == -1 || l2 == -1 || o == -1) { bad = true; }
//        System.out.println(h+" "+e+" "+l1+" "+l2+" "+o);
        if (!bad && h < e && e < l1 && l1 < l2 && l2 < o) {
            System.out.println("YES");
        }
        else { System.out.println("NO"); }
    }
}