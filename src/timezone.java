import java.util.*;
public class timezone {
    private static int cat(String from) {
        if (from.equals("DE") || from.equals("FL") || from.equals("NJ") || from.equals("ON") || from.equals("VA")) {
            return 3;
        }
        if (from.equals("MO") || from.equals("TX") || from.equals("WI")) {
            return 2;
        }
        if (from.equals("CO")) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner iangay = new Scanner(System.in);
        int tc = iangay.nextInt();
        while (tc --> 0) {
            int t1 = iangay.nextInt();
            String t2 = iangay.next();
            int fin = t1;
            if (t1 == 12 && t2.equals("AM"))
                fin = 0;
            else if (t2.equals("PM")) {
                fin = 12 + t1 % 12;
            }
            int from = cat(iangay.next()), to = cat(iangay.next());
            int num = fin + to - from;
            if (num == 12)
                System.out.println(12+" PM");
            else if (num%24 == 0)
                System.out.println(12+" AM");
            else if (num > 24)
                System.out.println(num%12+" AM");
            else if (num > 12)
                System.out.println(num%12+" PM");
            else if (num < 0)
                System.out.println(num + 12 + " PM");
            else
                System.out.println(num+" AM");
        }
    }
}