import java.util.*;
public class distance {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int l = iangay.nextInt(), k = iangay.nextInt();
            String t = "0".repeat(200000);//iangay.next();
            char[] ta = t.toCharArray();
            String r = "0".repeat(2*k+1);
//            System.out.println(t);
            int count = 0;
            if (!t.contains("1") || t.indexOf("1") > k) {
                ta[0] = '1';
                t = String.valueOf(ta);
                count++;
            }
            int i = t.indexOf("1");
            while (i < l - (2*k+1) && i >= 0) {
                if (t.substring(i + 1, i + (2 * k + 1) + 1).equals(r)) {
                    ta[i+k+1] = '1';
                    t = String.valueOf(ta);
                    count++;
                }
                i = t.indexOf("1", i + 1);
            }
            if (t.substring(i + 1).equals("0".repeat(l - i - 1)) && l - i - 1 > k) {
                ta[i+k+1] = '1';
                t = String.valueOf(ta);
                count++;
            }
            System.out.println(count);
//            System.out.println(t);
//            System.out.println();
        }
    }
}