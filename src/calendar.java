import java.util.*;
public class calendar {
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int days = iangay.nextInt(), week = iangay.nextInt();
            long min = Math.min(days, week);
            long ans = min * (min - 1) / 2;
//            System.out.print(min+" "+ans+" ");
            if (days > week) { ans += week; }
            else { ans++; }
            System.out.println(ans);
        }
    }
}