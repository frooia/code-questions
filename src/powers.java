import java.util.*;
public class powers {
    private static boolean arrayAchievable(String s) {
        for (String letter : s.split("")) { if (!letter.equals("0") && !letter.equals("1")) { return false; } }
        return true;
    }
    private static String toBase(int n, int base) {
        int log = (int)(Math.log(n) / Math.log(base));
        String num = "";
        for (int i = log; i >= 0; i--) {
            double divided = (n / Math.pow(base, i));
            num += Integer.toString((int)divided);
            n -= Math.pow(base, i) * divided;
        }
        return num;
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = in.nextInt();
            int base = in.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) { sum += in.nextInt(); }
            String sumString = Integer.toString(sum, base);
            if (sumString.length() > n) { System.out.println("NO"); }
            else if (arrayAchievable(sumString)) { System.out.println("YES"); }
            else { System.out.println("NO"); }
        }
    }
}
